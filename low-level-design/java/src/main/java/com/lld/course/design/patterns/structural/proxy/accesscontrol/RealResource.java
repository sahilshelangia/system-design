package com.lld.course.design.patterns.structural.proxy.accesscontrol;

public class RealResource implements Resource{
    @Override
    public void accessResource() {
        System.out.println("RealResource: Accessing sensitive resource...");
    }
}
