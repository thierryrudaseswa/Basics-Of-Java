package rw.ac.rca.hrms;

public class Employee {
    private String employeeName;
    private int employeeId;
    private String address;

    public Employee(String employeeName, int employeeId,String address) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.address = address;
    }

    // Getters and setters for employee attributes


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

