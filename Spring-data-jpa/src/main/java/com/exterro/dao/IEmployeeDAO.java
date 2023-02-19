package com.exterro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.model.Employee;

public interface IEmployeeDAO extends JpaRepository<Employee, Integer>{
	
	List<Employee> findBySkill(String name);
	

}
