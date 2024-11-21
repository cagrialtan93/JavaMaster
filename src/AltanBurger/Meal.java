package AltanBurger;

public class Meal {
    private Hamburger hamburger;
    private SideItem sideItem;
    private Drink drink;

    public Meal() {
        this.hamburger = new Hamburger("Small Burger");
        this.drink = new Drink("Small Coke", 1);
        this.sideItem = new SideItem("Fries");
    }

    public Meal(Hamburger hamburger, SideItem sideItem, Drink drink) {
        this.hamburger = hamburger;
        this.sideItem = sideItem;
        this.drink = drink;
    }

    void justAMethod(){
        System.out.println(drink.getPrice());
    }

    int getTotalPrice(){
        return drink.getPrice() + sideItem.getPrice() + hamburger.getTotalPrice();
    }
}
