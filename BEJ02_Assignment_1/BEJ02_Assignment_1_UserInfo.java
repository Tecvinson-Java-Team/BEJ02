/**********************

Group name: BEJ02

Assignment 1

Contributors: Pascal Obeleagu, Antoinette Ifeyinwa Okeke, Mercy Ashake,
Sulaiman Olaide, Monica Inweh, Cornelius Nnaji, Olayinka Olubode

Instructor: Mr. Adesola

Date: June 14, 2024

*/


import java.util.Scanner;  // Import the Scanner to read input from the user.


public class BEJ02_Assignment_1_UserInfo //class UserInfo, but renamed to BEJ02_Assignment_1_UserInfo as per the submission instruction
{
	public static void main(String []args) //main method
	{ 
   
   //Variable declaration to store user information
		String title;
      String firstName;
      String lastName;
      String email;
      String phone;
      String country;
      String dateOfBirth;
      String placeOfBirth;
      String location;
      String gender;
      
      //Lets program to receive input from user's keyboard
      Scanner newScanner = new Scanner(System.in);
      
       //This allows user to enter title. Options are Mr., Mrs., Dr., etc.)
		System.out.println("Enter your title: "); // Output input by user
      title = newScanner.nextLine(); // String input
      
      
      //This allows user to enter their First Name
      System.out.println("Enter your First Name: "); // Output input by user
      firstName = newScanner.nextLine(); // String input
     
     
      //This allows user to enter their Last Name
      System.out.println("Enter your Last Name: "); // Output input by user
      lastName = newScanner.nextLine(); // String input

      //This allows user to enter their email address
      System.out.println("Enter your Email address: "); // Output input by user
      email = newScanner.nextLine(); // String input
      
      //This allows user to enter their Phone number
      System.out.println("Enter your Phone Number: "); // Output input by user
     phone = newScanner.nextLine(); //String input
   
      
      //This allows user to enter the Country they reside in
      System.out.println("Enter the country you reside: "); // Output input by user
      country = newScanner.nextLine(); // String input
      
      //This allows user to enter their Date of Birth
      System.out.println("Enter your Date of Birth: "); // Output input by user
      dateOfBirth = newScanner.nextLine(); //String input
      
      //This allows user to enter their Place of Birth
      System.out.println("Enter your Place of Birth: "); // Output input by user
      placeOfBirth = newScanner.nextLine(); // String input
      
      //This allows user to enter their Location
      System.out.println("Enter your Location: "); // Output input by user
      location = newScanner.nextLine(); // String input
      
      //This allows user to enter Gender
      System.out.println("Enter your Gender: "); // Output input by user
      gender = newScanner.nextLine(); // String input
      
      
      //close the scanner
      newScanner.close();

        //display the inputted information
        System.out.println("\nUser information: "); //User information
        System.out.println("Title: " + title); //Title
        System.out.println("First Name: " + firstName); //First Name
        System.out.println("Last Name: " + lastName); //Last Name
        System.out.println("Email address: " + email); //Email address
        System.out.println("Phone Number: " + phone); //Phone Number
        System.out.println("Date Of Birth: " + dateOfBirth); //Date of Birth
        System.out.println("Place Of Birth: " + placeOfBirth); //Place of Birth
        System.out.println("Current Location: " + location); //Current Location
        System.out.println("Gender: " + gender); //Gender

      
      
     
	}
 
}