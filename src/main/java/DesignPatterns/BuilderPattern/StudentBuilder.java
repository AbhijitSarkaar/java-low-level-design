package DesignPatterns.BuilderPattern;

public abstract class StudentBuilder {

    int rollNumber;
    String studentName;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

}
