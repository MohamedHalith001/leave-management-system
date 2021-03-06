package com.mohamed.service;

import java.util.ArrayList;
import java.util.List;

import com.mohamed.model.Employee;

public class EmployeeManager {

	private EmployeeManager() {
		// Default Constructor
	}

	private static final List<Employee> employeeList = new ArrayList<>();

	static {
		Employee employee1 = new Employee("Mohamed", 2627);
		employee1.setUsername("moha2627");
		employee1.setPassword("2627moha");
		employeeList.add(employee1);

		Employee employee2 = new Employee("Halith", 2728);
		employee2.setUsername("hali2628");
		employee2.setPassword("2628hali");
		employeeList.add(employee2);
	}

	/**
	 * This method is used to return the list of employees
	 * 
	 * @return List<Employee>
	 */
	public static List<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * This method is used to return a specific employee. Employee username is
	 * obtained and returns employee with that username.
	 * 
	 * @param username
	 * @return
	 */
	public static Employee getEmployee(String username) {
		Employee getEmployee = null;
		for (Employee employee : employeeList) {
			if (employee.getUsername().equals(username)) {
				getEmployee = employee;
				break;
			}
		}
		return getEmployee;
	}

}
