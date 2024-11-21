package AltanBurger;

public class Hamburger {
    private String type;
    private int basePrice = 240;
    private String[] toppings = {"Topping 1", "Topping 2", "Topping 3"};
    private int toppingCount;
    private int totalPrice = 0;

    public Hamburger(String type) {
        this.type = type;
        this.toppingCount = 0;
    }

    public Hamburger(String type, int toppingCount) {
        this.type = type;
        this.toppingCount = toppingCount;
    }

    public int getTotalPrice() {
        if (toppingCount == 1) {
            totalPrice+= 50;
        } else if (toppingCount == 2) {
            totalPrice+= 100;
        } else if (toppingCount ==3 ){
            totalPrice+= 150;
        }
        return basePrice + totalPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
