package org.abhi.s1.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.abhi.s1.datamodel.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employees;
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public Employee getSingleEmployee(String kinId) {
		for(Employee employee : employees) {
			if(employee.getKinId().equals(kinId)) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		return employees;
	}
	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}
}
