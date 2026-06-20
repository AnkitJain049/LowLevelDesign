package com.lld.projects.fileSystem;

public class Main {
    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movie");
        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedy = new Directory("ComedyMovie");
        File hulchul=new File("Hulchul");
        comedy.add(hulchul);
        movieDirectory.add(comedy);

        movieDirectory.ls();
    }
}
