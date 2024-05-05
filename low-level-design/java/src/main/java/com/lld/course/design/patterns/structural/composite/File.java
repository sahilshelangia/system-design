package com.lld.course.design.patterns.structural.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements FileSystemObject {
    private String name;
    private int size;
    @Override
    public int getSize() {
        return this.size;
    }
}
