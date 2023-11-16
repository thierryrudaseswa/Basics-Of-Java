package rw.ac.rca.hrms;
import rw.ac.rca.hrms.Employee;

public class Accountant extends Employee {

  private int money;
    public Accountant(String employeeName, int employeeId, String address, int money) {
        super(employeeName, employeeId, address);

        this.money=money;

    }
}
