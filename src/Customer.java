public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;
    private static int hello = 254;

    public Customer() {
        System.out.println(Customer.hello);
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

    public static void hello(){
        System.out.println("Hello");
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmailAddress(String emailAddress) {
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
