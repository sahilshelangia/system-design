package com.lld.course.design.patterns.structural.proxy.lazyinitialization;

public class Main {
    public static void main(String[] args) {
        ImageLoader imageLoader = new ProxyImage();
        imageLoader.load();
    }
}
