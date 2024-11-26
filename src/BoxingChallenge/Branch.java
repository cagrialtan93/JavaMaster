package BoxingChallenge;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction){
        Customer customerToAdd = new Customer(name, initialTransaction);
        if (!customers.contains(customerToAdd)){
            customers.add(customerToAdd);
            System.out.println("Customer added.");
            return true;
        } else {
            System.out.println("Failed. We already have this customer in our database.");
            return false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        if (findCustomer(name) != null){
            findCustomer(name).addTransaction(transaction);
            System.out.println("Added transaction to " + name);
            return true;
        } else {
            System.out.println("Failed. No user has been found.");
            return false;
        }
    }

    public Customer findCustomer(String name){
        for (Customer customer :
                customers) {
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }
}
