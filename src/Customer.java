public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer() {
        System.out.println("All quiet.");
    }

    public Customer(String emailAddress, String name) {
        this.emailAddress = emailAddress;
        this.name = name;
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
