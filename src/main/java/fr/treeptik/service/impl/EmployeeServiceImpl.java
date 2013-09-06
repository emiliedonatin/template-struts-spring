package fr.treeptik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.EmployeeDao;
import fr.treeptik.entity.Employee;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public Employee add(Employee employee) throws ServiceException {
        employeeDao.save(employee);
        
        return employee;
    }

    @Override
    public List<Employee> getAll() throws ServiceException {
        return employeeDao.findAll();
    }

    @Override
    public Employee get(Integer id) throws ServiceException {
        return employeeDao.findOne(id);
    }

    @Override
    @Transactional
    public void delete(Integer employeeId) throws ServiceException {
       
    	employeeDao.delete(employeeId);
    }
    
}
