package com.springboot.crudoperations.repository;

import com.springboot.crudoperations.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
}
