package BoxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();
    private double total;

    public Customer(String name, Double initialTransaction) {
        this.name = name;
        transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double totalTransactions() {
        for (double x :
                transactions) {
            total += x;
        }
        return total;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
