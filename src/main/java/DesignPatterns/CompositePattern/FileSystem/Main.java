package DesignPatterns.CompositePattern.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("directory1");

        File file1 = new File("file1");
        File file2 = new File("file2");

        Directory subDirectory = new Directory("subDirectory1");
        File file3 = new File("file3");
        File file4 = new File("file4");
        subDirectory.add(file3);
        subDirectory.add(file4);

        directory.add(file1);
        directory.add(file2);
        directory.add(subDirectory);

        directory.ls();
    }
}
