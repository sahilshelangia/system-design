package com.lld.course.design.patterns.structural.proxy.lazyinitialization;

public class ProxyImage implements ImageLoader {
    private RealImage realImage;

    public ProxyImage() {
        System.out.println("Proxy image constructor is called");
    }

    @Override
    public void load() {
        if (realImage == null) {
            // lazy initialization.
            realImage = new RealImage();
        }
        realImage.load();
    }
}
