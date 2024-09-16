import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.source.tree.BreakTree;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.addWater();
        smartKitchen.getBrewMaster().brewCoffee();
    }
}
