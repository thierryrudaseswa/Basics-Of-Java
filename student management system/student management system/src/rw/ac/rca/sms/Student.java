package rw.ac.rca.sms;

public class Student {
    private String studentName;
    private int studentAge;

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    // Getters and setters for student attributes


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}

