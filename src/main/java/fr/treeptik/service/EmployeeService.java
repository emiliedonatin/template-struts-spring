package fr.treeptik.service;

import java.util.List;

import fr.treeptik.entity.Employee;

public interface EmployeeService {
    public void add(Employee employee);
    public List<Employee> getAll();
    public Employee get(Integer id);
    public void delete(Integer employeeId);
}
