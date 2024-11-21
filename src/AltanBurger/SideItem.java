package AltanBurger;

public class SideItem {
    private String type;
    private int price;

    public SideItem(String type) {
        this.type = type;
    }

    public int getPrice() {
        if (type.equals("Fries")) {
            price += 50;
        }
        return price;
    }
}
