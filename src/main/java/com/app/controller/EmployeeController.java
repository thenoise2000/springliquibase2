package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.Employee;
import com.app.domain.EmploymentType;
import com.app.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	 private final EmployeeRepository employeeRepository;

	  public EmployeeController(EmployeeRepository employeeRepository)
	  {
	    this.employeeRepository = employeeRepository;
	  }

	  
	  @GetMapping(path = "/list")
	  public List<Employee> findAll()
	  {
	    return employeeRepository.findAll();
	  }

	  /**
	   * Creates a new employee in the database
	   *
	   * @return Newly created employee
	   *
	   * @author Pavan Kumar Jadda
	   * @since 1.0.0
	   */
	  @GetMapping(path = "/create")
	  public Employee createEmployee()
	  {
	    Employee employee = new Employee();
	    employee.setFirstName("John");
	    employee.setLastName("Reese");
	    employee.setEmail("john.reese@example.com");
	    employee.setPhone("903-888-9999");
	    employee.setEmploymentType(EmploymentType.CONTRACTOR);
	    return employeeRepository.saveAndFlush(employee);
	  }
}
