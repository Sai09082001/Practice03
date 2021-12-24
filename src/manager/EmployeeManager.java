package manager;

import model.Employee;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void sumSalaryListEmployee(){
        double s =  0;
        for (int i = 0; i < employees.size(); i++) {
            s+= employees.get(i).salaryEmployee();
        }
        System.out.println("Sum Salary List Employee "+s);
    }

    public void insertDataListEmployee(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
