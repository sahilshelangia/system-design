package com.lld.course.design.patterns.structural.proxy.lazyinitialization;

public class RealImage implements ImageLoader{
    public RealImage() {
        System.out.println("Real image constructor called");
    }

    @Override
    public void load() {
        System.out.println("Loading the real image");
    }
}
