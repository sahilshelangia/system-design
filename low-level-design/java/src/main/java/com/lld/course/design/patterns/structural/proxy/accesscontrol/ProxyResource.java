package com.lld.course.design.patterns.structural.proxy.accesscontrol;

public class ProxyResource implements Resource {
    private RealResource realResource;
    private boolean isAdmin;

    public ProxyResource(boolean isAdmin) {
        this.realResource = new RealResource();
        this.isAdmin = isAdmin;
    }

    @Override
    public void accessResource() {
        if(isAdmin){
            realResource.accessResource();
        } else{
            System.out.println("Access denied");
        }
    }
}
