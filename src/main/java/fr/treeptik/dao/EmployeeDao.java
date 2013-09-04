package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.entity.Employee;

public interface EmployeeDao  extends JpaRepository<Employee, Integer>{
    
    @Query("select e from Employee e where e.email=:email")
    public Employee findOneByEmail(@Param("email") String email);

    @Query("select e from Employee e where e.lastname=:lastname")
    public List<Employee> findAllByLastname(@Param("lastname") String lastname);
    
}