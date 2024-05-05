package com.lld.course.design.patterns.structural.proxy.cache;

import java.util.HashMap;

public class EmployeeProxy implements Data {
    HashMap<Integer, String> employeeIDToNameCache;
    Employee employee;

    public EmployeeProxy() {
        this.employeeIDToNameCache = new HashMap<>();
        employee = new Employee();
    }

    @Override
    public String getEmployeeNameById(int id) {
        if (employeeIDToNameCache.containsKey(id)) {
            System.out.println("returning result from cache");
            return employeeIDToNameCache.get(id);
        }
        String name = employee.getEmployeeNameById(id);
        employeeIDToNameCache.put(id, name);
        return name;
    }
}
