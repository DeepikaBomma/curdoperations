package com.springboot.crudoperations.controller;

import com.springboot.crudoperations.entity.Employee;
import com.springboot.crudoperations.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmpController {

    @Autowired
    EmpRepository repository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    Employee createOrSaveEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee getEmployeeById(@PathVariable Long id) {
        return repository.findById(id).get();
    }


    @PutMapping("/update/employees/{id}")
    Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id).map(employee -> {
            employee.setSal(newEmployee.getSal());
            employee.setEmpdept(newEmployee.getEmpdept());
            employee.setEmpname(newEmployee.getEmpname());
            return repository.save(employee);
        }).orElseGet(() -> {
            newEmployee.setEmpid(id);
            return repository.save(newEmployee);
        });
    }

    @DeleteMapping("/delete/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
