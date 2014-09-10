package org.abhi.s1.service;

import java.util.List;

import org.abhi.s1.dao.EmployeeDao;
import org.abhi.s1.datamodel.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service("abc")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployeeById(String kinId) {
		return employeeDao.getSingleEmployee(kinId);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		return employeeDao.getEmployeesByName(name);
	}
}
