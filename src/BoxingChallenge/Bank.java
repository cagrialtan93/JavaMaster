package BoxingChallenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public boolean addBranch(String name) {
        Branch branchToAdd = new Branch(name);
        boolean isTrue = false;

        if (findBranch(name) == null){
            branches.add(branchToAdd);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) != null && findBranch(branchName).findCustomer(customerName) != null){
            addCustomer(branchName, customerName, initialTransaction);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        if (findBranch(branchName) != null && findBranch(branchName).findCustomer(customerName) != null && transaction > 0){
            findBranch(branchName).findCustomer(customerName).addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    public Branch findBranch(String name) {
        for (Branch branch :
                branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null && printTransactions){
            for (Customer customer :
                    findBranch(branchName).getCustomers()) {
                System.out.println(customer.getName() + customer.getTransactions());
            }
            return true;
        } else {
            return false;
        }
    }
}
