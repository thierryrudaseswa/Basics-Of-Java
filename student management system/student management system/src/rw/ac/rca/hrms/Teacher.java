package rw.ac.rca.hrms;

import rw.ac.rca.hrms.Employee;

public class Teacher extends Employee {
    private String subject;

    public Teacher(String employeeName, int employeeId, String address, String subject) {
        super(employeeName, employeeId, address);
        this.subject = subject;
    }

    // Getters and setters for teacher attributes

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching the subject: " + subject);
    }



}

