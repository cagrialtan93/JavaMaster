package AltanBurger;

public class Drink {
    private String type;
    private int size = 1;
    private int price;

    public Drink(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public int getPrice() {
        if (size == 1) {
            price+= 5;
        } else if (size == 2) {
            price+= 10;
        } else {
            price+= 15;
        }
        return price;
    }
}
