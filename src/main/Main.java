package main;

import manager.CustomerManager;
import manager.EmployeeManager;
import model.Customer;
import model.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        System.out.println("Please enter length data list employee :");
        int n = sc.nextInt();
        for (int i= 0; i<n ;i++){
            System.out.println("Please enter name employee :");
            String name = sc.next();
            System.out.println("Please enter address employee :");
            String address = sc.next();
            System.out.println("Please enter phoneNumber employee :");
            String phoneNumber = sc.next();
            System.out.println("Please enter coSalary employee :");
            Double coSalary = sc.nextDouble();
            employeeManager.insertDataListEmployee(new Employee(name,address,phoneNumber,coSalary));
        }
        System.out.println("List Data For Employee "+employeeManager.getEmployees());
        employeeManager.sumSalaryListEmployee();

        System.out.println("Please enter length data list customer :");
        int m = sc.nextInt();
        for (int i= 0; i<m ;i++){
            System.out.println("Please enter name customer :");
            String name = sc.next();
            System.out.println("Please enter address customer :");
            String address = sc.next();
            System.out.println("Please enter phoneNumber customer :");
            String phoneNumber = sc.next();
            System.out.println("Please enter nameCompany customer :");
            String nameCompany = sc.next();
            System.out.println("Please enter valueBill customer :");
            Double valueBill = sc.nextDouble();
            customerManager.insertDataListCustomer(new Customer(name,address,phoneNumber,nameCompany,valueBill));
        }
        System.out.println("List Data For Customer "+customerManager.getCustomers());
        System.out.println("Please enter phoneNumber require customer :");
        String phoneNumberRequire = sc.next();
        customerManager.printInfoCustomerWithPhoneNumber(phoneNumberRequire);
    }
}
