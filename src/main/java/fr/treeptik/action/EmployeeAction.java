package fr.treeptik.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.entity.Employee;
import fr.treeptik.service.EmployeeService;

@Component(value = "employeeAction")
@Scope("prototype")
@Namespace("/employee")
public class EmployeeAction extends ActionSupport implements
		ModelDriven<Employee> {

	private static final long serialVersionUID = 1L;

	@Autowired
	private EmployeeService employeeService;
	
	private Employee employee = new Employee();
	private List<Employee> employees = new ArrayList<>();

	@Override
	public Employee getModel() {
		return employee;
	}

	public void validate() {

		if (getEmployee().getFirstname().trim().length() == 0) {
			addFieldError("firstname", "First name is required.");
		}

	}

	@Action(value = "addAction", results = {
			@Result(name = "success", type = "redirectAction", location = "listAction.action"),
			@Result(name = "input", location = "/employee/add.jsp") })
	public String addEmployee() throws Exception {
		System.out.println("ADD EMPLOYEE");

		System.out.println(employee);
		
		employeeService.add(employee);

		return "success";
	}

	@Action(value = "listAction", results = {
			@Result(name = "success", location = "/employee/list.jsp")})
	@SkipValidation
	public String listEmployees() throws Exception {
		employees = employeeService.getAll();

		return "success";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}