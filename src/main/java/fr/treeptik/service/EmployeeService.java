package fr.treeptik.service;

import java.util.List;

import fr.treeptik.entity.Employee;
import fr.treeptik.exception.ServiceException;

public interface EmployeeService {
    
	Employee add(Employee employee) throws ServiceException;
    List<Employee> getAll() throws ServiceException;
    Employee get(Integer id) throws ServiceException;
    void delete(Integer employeeId) throws ServiceException;
}
