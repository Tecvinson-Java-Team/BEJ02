/*

Group name: BEJ02
Instructor: Mr. Adesola
Date: June 21, 2024
*/

import java.util.Scanner;

    public class ArithmeticOperations {
        public static void main (String []args){

        /*Initializing all the variables:
        x & y represent the two integers
        sum, difference, product, average, distance, maximum & minimum are calculated variables
         */
            int x;
            int y;
            double sum;
            double difference;
            double product;
            double average;
            double distance;
            double maximum;
            double minimum;

            //allows the program receive input from user's keyboard
            Scanner scanner=new Scanner(System.in);

            //This prompts the user to input integers for x and y
            System.out.println("What is the value for x: ");
            x = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the value for y: ");
            y = Integer.parseInt(scanner.nextLine());

            /*
            Calculations for variable; sum,difference,product,average,distance,maximum & minimum
             */
            sum = x+y;
            difference = x-y;
            product = x*y;
            average = sum/2;
            distance = Math.sqrt(Math.pow((x-y), 2) + Math.pow((x-y), 2));
            maximum = Math.max(x,y);
            minimum = Math.min(x,y);

            //This displays the results to the user.
            System.out.println("The sum of the two numbers you entered is: " + sum); //displays the sum
            System.out.println("The difference of the two numbers you entered is: " + difference); //displays the difference
            System.out.println("The product of the two numbers you entered is: " + product); //displays the product
            System.out.println("The average of the two numbers you entered is: " + average); //displays the average
            System.out.println("The distance of the two numbers you entered is: " + distance); //displays the distance
            System.out.println("The maximum of the two numbers you entered is: " + maximum); //displays the maximum
            System.out.println("The minimum of the two numbers you entered is: " + minimum); //displays the minimum

        }

    }
