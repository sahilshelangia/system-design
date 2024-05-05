package com.lld.course.design.patterns.structural.composite;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Directory implements FileSystemObject {
    private String name;
    private List<FileSystemObject> fileSystemObjects;

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemObject fileSystemObject : fileSystemObjects) {
            totalSize = totalSize + fileSystemObject.getSize();
        }
        return totalSize;
    }
}
