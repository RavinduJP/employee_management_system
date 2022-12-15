package com.example.employeesystemapi.repository;

import com.example.employeesystemapi.entity.EmployeeEntity;
import com.example.employeesystemapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
