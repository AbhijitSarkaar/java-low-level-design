package DesignPatterns.BuilderPattern;

public class Student {
    int rollNumber;
    String studentName;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.studentName = studentBuilder.studentName;
    }
}
