/*

 Group name: BEJ02
 Instructor: Mr. Adesola
 Date: June 21, 2024

 */


import java.util.Scanner;

public class PowerCalculations{
    public static void main(String []args){

    /*
    Initializing variables. x represents the integer. square, cube, fourthPower are the variables to be calculated.
     */
    int x;
    double square;
    double cube;
    double fourthPower;

        /*
        Prompts the user to input a value for x
         */
        System.out.println("Enter the value of x= ");
        Scanner scanner=new Scanner(System.in);
        x = Integer.parseInt(scanner.nextLine()); //This allows the program to convert string to an integer

        /*
        Calculating the variables; square,cube,fourthPower.
        Math.pow is a math class used to calculate powers of a given number in this case, "x"
         */
        square = Math.pow(x, 2);
        cube = Math.pow(x, 3);
        fourthPower = Math.pow(x, 4);

        /*
        This displays the results to the user
         */

        System.out.println("The square of the number you entered is: " + square);
        System.out.println("The Cube of the number you entered is: " + cube);
        System.out.println("The fourth power of the number you entered is: " + fourthPower);


    }
}