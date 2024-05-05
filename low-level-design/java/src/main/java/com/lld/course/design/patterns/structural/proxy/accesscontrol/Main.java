package com.lld.course.design.patterns.structural.proxy.accesscontrol;

public class Main {
    public static void main(String[] args) {
        // Simulate a non-admin user trying to access the resource
        Resource proxyNonAdmin = new ProxyResource(false);
        proxyNonAdmin.accessResource(); // Access denied

        // Simulate an admin user trying to access the resource
        Resource proxyAdmin = new ProxyResource(true);
        proxyAdmin.accessResource(); // Access granted
    }
}
