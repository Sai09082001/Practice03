package manager;

import model.Customer;
import model.Employee;

import java.util.ArrayList;

public class CustomerManager {
    private ArrayList<Customer> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
    }

    public void printInfoCustomerWithPhoneNumber(String phoneRequire){
       for (int i=0; i< customers.size();i++){
           if(customers.get(i).getPhoneNumber().equals(phoneRequire)){
               System.out.println("Info Customer Require "+ customers.get(i));
           }
       }
    }

    public void insertDataListCustomer(Customer customer){
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
