package DesignPatterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudentBuilder());
        Student engineeringStudent = director.createStudent();
        System.out.println(engineeringStudent.studentName);
        System.out.println(engineeringStudent.rollNumber);

        Director director1 = new Director(new MBAStudentBuilder());
        Student mbaStudent = director1.createStudent();
        System.out.println(mbaStudent.studentName);
        System.out.println(mbaStudent.rollNumber);
    }
}
