package com.lld.course.design.patterns.structural.composite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1", 1);
        File file2 = new File("file2", 2);
        File file3 = new File("file3", 3);

        Directory directory = new Directory("directory", Arrays.asList(file1, file2, file3));
        System.out.printf("Directory size: %d", directory.getSize());
    }
}
