package com.javaProgramming.shop.interfaces;

public interface EmployeeInterface{

    String getName();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    boolean isFree();

}
