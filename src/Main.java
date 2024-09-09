import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.source.tree.BreakTree;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(6,5);
        Point secondPoint = new Point(3,1);
        
        System.out.println(firstPoint.distance(secondPoint));
    }
}
