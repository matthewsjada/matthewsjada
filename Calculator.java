/*
Author: Jada Matthews
Date: January 21, 2020
Description: Lab 2: Four-function calculator
Course: COP3502
 */
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) //This is the entry point of the program.
    {
        Scanner scan = new Scanner(System.in); //This allows for user input.

        System.out.print("Enter first operand: ");
        double operand1 = scan.nextDouble(); //Double precision allows decimals and fractions.

        System.out.print("Enter second operand: ");
        double operand2 = scan.nextDouble(); //This is where the user will input their number into the calculator.

        //Below is the display of the calculator that will be shown to the user.
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Which operation do you want to perform? ");
        int operation = scan.nextInt(); //Allows for user input of an integer number.

        /*
        Below I used the switch operation since I know each of the four operations.
        The compiler goes through each case to see if it matches with the user's input.
         */

        switch(operation)
        {
            case 1 :
                System.out.print("The result of the operation is ");
                System.out.print(operand1 + operand2 + "."); //Addition operation applied.
                System.out.print(" Goodbye!");
                break;
            case 2 :
                System.out.print("The result of the operation is ");
                System.out.print(operand1 - operand2 + "."); //Subtraction operation applied.
                System.out.print(" Goodbye!");
                break;
            case 3 :
                System.out.print("The result of the operation is ");
                System.out.print(operand1 * operand2 + "."); //Multiplication operation applied.
                System.out.print(" Goodbye!");
                break;
            case 4 :
                System.out.print("The result of the operation is ");
                System.out.print(operand1 / operand2 + "."); //Division operation applied.
                System.out.print(" Goodbye!");
                break;
        }

        if(operation < 1 || operation > 4) //If user inputs an incorrect option.
        {
            System.out.print("Error: Invalid selection! Terminating program.");
        }



    }
}
