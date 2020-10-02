package com.springboot.crudoperations.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empid;



    private String empname;
    private long sal;
    private  String empdept;

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public String getEmpdept() {
        return empdept;
    }

    public void setEmpdept(String empdept) {
        this.empdept = empdept;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
}
