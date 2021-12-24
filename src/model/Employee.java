package model;

public class Employee extends Person{
    private double coSalary;

    public Employee(String name, String address, String phoneNumber, double coSalary) {
        super(name, address, phoneNumber);
        this.coSalary = coSalary;
    }

    public double salaryEmployee(){
        return coSalary* 1650000;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name  +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "SalaryEmployee= " + salaryEmployee() + '\'' +
                '}';
    }

    public double getCoSalary() {
        return coSalary;
    }

    public void setCoSalary(double coSalary) {
        this.coSalary = coSalary;
    }
}
