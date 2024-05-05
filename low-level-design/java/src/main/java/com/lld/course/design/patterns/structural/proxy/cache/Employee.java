package com.lld.course.design.patterns.structural.proxy.cache;

public class Employee implements Data{
    @Override
    public String getEmployeeNameById(int id) {
        System.out.println("Made a db call");
        // As DB call will be made, it's a time-consuming process. Hence, we are putting the data in cache in the proxy object.
        // assume to have some db call here.
        return "Sahil";
    }
}
