package DesignPatterns.BuilderPattern;


public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    public Student createEngineeringStudent() {
        return studentBuilder
                .setStudentName("user1").setRollNumber(1).build();
    }

    public Student createMBAStudent() {
        return studentBuilder.setStudentName("user2").setRollNumber(2).build();
    }

}
