package model;

public class Customer extends Person{
    private String nameCompany;
    private double valueBill;

    public Customer(String name, String address, String phoneNumber, String nameCompany, double valueBill) {
        super(name, address, phoneNumber);
        this.nameCompany = nameCompany;
        this.valueBill = valueBill;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getValueBill() {
        return valueBill;
    }

    public void setValueBill(double valueBill) {
        this.valueBill = valueBill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCompany='" + nameCompany + '\'' +
                ", valueBill=" + valueBill +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
