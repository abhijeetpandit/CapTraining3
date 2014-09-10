package org.abhi.s1.dao;

import java.util.List;

import javax.annotation.Resource;

import org.abhi.s1.datamodel.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Resource
	private List<Employee> employees;
	
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
