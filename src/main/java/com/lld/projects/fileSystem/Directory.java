package com.lld.projects.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;
    public Directory(String name){
        directoryName=name;
        fileSystemList=new ArrayList<>();
    }
    public void add(FileSystem obj){
        fileSystemList.add(obj);
    }
    public void ls(){
        System.out.println("Directory Name: " + directoryName);
        for(FileSystem obj : fileSystemList){
            obj.ls();
        }
    }

}
