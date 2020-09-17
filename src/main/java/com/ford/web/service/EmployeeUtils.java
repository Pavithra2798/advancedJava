package com.ford.web.service;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
    static List<Employee> employeeList = new ArrayList<>();

    public static void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> viewAllEmployees(){
        return employeeList;
    }
}
