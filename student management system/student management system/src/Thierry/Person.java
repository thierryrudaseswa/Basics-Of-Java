package Thierry;

import rw.ac.rca.sms.Student;

import rw.ac.rca.hrms.*;

public class Person{

    public static void main(String[] args){

        Student mystudent=new Student("angele",12);

        System.out.println("Name: "+ mystudent.getStudentName());

        System.out.println("Age: "+ mystudent.getStudentAge());

        Teacher myTeacher=new Teacher("aphrorwa",2,"Nyabihu","java");

        System.out.println("TeachersName:"+ myTeacher.getEmployeeName());

        Accountant myAccountant=new Accountant("zamzam",4,"Gasabo",700000);

        System.out.println("Accountant Id:"+ myAccountant.getEmployeeId());

        Nurse myNurse=new Nurse("vanessa",9,"Nyamirabo");

        System.out.println("patientName:"+myNurse.getEmployeeName());
    }
}