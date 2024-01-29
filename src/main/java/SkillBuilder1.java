import java.io.PrintStream;
import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @Evans
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String userName = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        double equation = (4.0/3) * Math.pow(2, (Math.sqrt(5) / (Math.pow(spice, 3))));
        System.out.println("Well " + userName + ", the spice value resulted in " + equation);

        double equationt100 = equation * 100;
        int equationInt = (int) (equationt100);
        double equationFinal = equationInt/100.0;
        System.out.println("And the converted value is " + equationFinal);
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double paintNeeded = wallArea/ squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f", paintNeeded);
        System.out.println(" gallons");

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.print("Cans needed: " + cansNeeded + "can(s)");
    }
}
