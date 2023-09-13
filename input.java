/**
 * input.java  09/12/2023
 *
 * @author - Matthew Richman
 * @author - 5
 * @author - 922408
 *
 * @author - I received help from ...
 *
 */

import java.util.Scanner; //Import scanner

public class input {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); //Start scanner to catch keyboard interaction

        int intOne, intTwo; //define variables
        double dub1, dub2;
        float fl1, fl2;
        short sh1, sh2;

        System.out.print("Enter an integer :: "); //prompt user for input
        intOne = keyboard.nextInt(); //save input to variable
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.print("\nEnter a double :: ");
        dub1 = keyboard.nextDouble();
        System.out.print("Enter a double :: ");
        dub2 = keyboard.nextDouble();

        System.out.print("\nEnter a float :: ");
        fl1 = keyboard.nextFloat();
        System.out.print("Enter a float :: ");
        fl2 = keyboard.nextFloat();

        System.out.print("\nEnter a short :: ");
        sh1 = keyboard.nextShort();
        System.out.print("Enter a short :: ");
        sh2 = keyboard.nextShort();

        System.out.println("\ninteger one = " + intOne); //outputs all the variables
        System.out.println("integer two = " + intTwo);

        System.out.println("\ndouble one = " + dub1);
        System.out.println("double two = " + dub2);

        System.out.println("\nfloat one = " + fl1);
        System.out.println("float two = " + fl2);

        System.out.println("\nshort one = " + sh1);
        System.out.println("short two = " + sh2);
    }
}
