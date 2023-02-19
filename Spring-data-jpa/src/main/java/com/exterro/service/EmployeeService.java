package com.exterro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.exterro.dao.IEmployeeDAO;
import com.exterro.model.Employee;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	private IEmployeeDAO empDao;

	@Override
	public List<Employee> findAll() {
		return empDao.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> result = empDao.findById(id);
		
		Employee emp = null;
		
		if(result.isPresent())
			emp = result.get();
		else
			System.out.println("Emp not found " + id);
		
		return emp;
	}


	@Override
	public void save(Employee emp) {
		 empDao.save(emp);
	}

	@Override
	public void deleteById(int id) {
		 empDao.deleteById(id);
	}

	@Override
	public List<Employee> findBySkill(String name) {
		return empDao.findBySkill(name);
	}

}
