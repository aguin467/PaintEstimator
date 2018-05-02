
import java.util.Scanner;

public class PaintEstimator {

    double getarea(double lenght, double width) {
        return lenght * width;
    }

    public static void main(String[] args) {
        PaintEstimator ob = new PaintEstimator();
        double gallonsPaintNeeded = 0.0;
        double cansNeeded = 0.0;
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter wall height (feet): ");
       

        System.out.println("Enter wall width (feet): ");
        double wallWidth = scnr.nextDouble();
        double wallHeight = 0;

        double wallArea = ob.getArea(wallHeight, wallWidth);
        System.out.println("Wall area: " + wallArea + " square feet");

        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");

    }

    private double getArea(double wallHeight, double wallWidth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
