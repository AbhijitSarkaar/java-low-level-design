package DesignPatterns.CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystemObjects;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemObjects = new ArrayList<>();
    }

    public void add(FileSystem fileObj) {
        fileSystemObjects.add(fileObj);
    }

    @Override
    public void ls() {
        System.out.println("directory name is " + directoryName);
        for(FileSystem fileSystemObj: fileSystemObjects) {
            fileSystemObj.ls();
        }
    }
}
