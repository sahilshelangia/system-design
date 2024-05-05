package com.lld.course.design.patterns.structural.proxy.cache;

public class Main {
    public static void main(String[] args) {
        Data employeeData = new EmployeeProxy();
        employeeData.getEmployeeNameById(1);
        employeeData.getEmployeeNameById(1);
        employeeData.getEmployeeNameById(1);
    }
}
