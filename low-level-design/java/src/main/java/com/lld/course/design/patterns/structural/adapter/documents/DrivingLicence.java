package com.lld.course.design.patterns.structural.adapter.documents;

import com.lld.course.design.patterns.structural.adapter.Document;

public class DrivingLicence implements Document {
    private String firstName;
    private String lastName;
    private int age;

    public DrivingLicence(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
