public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerNumber;

    public BankAccount(int accountNumber, int accountBalance, String customerName, String customerEmail, int customerNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
    }

    public void depositFunds(int moneyToDeposit){
        this.accountBalance += moneyToDeposit;
        System.out.println("You deposit " + moneyToDeposit + "$ successfully. You balance is " + accountBalance + "$ now ");
    }

    public void withdrawFunds(int moneyToWithdraw){
        this.accountBalance-=moneyToWithdraw;
        System.out.println("You withdraw " + moneyToWithdraw + "$ successfully. Your balance is " + accountBalance + "$ now.");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
