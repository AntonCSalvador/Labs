import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        double inputOne = scnr.nextDouble();

        System.out.print("Enter second operand: ");
        double inputTwo = scnr.nextDouble();
//Menu time
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
//Interger accepting part for the calculations PepeHands
        System.out.print("Which operation do you want to perform? ");
        double solution;
        int calcChoice = scnr.nextInt();
        if (calcChoice == 1) {
            solution = inputOne + inputTwo;
            System.out.println("The result of the operation is " + solution + ". Goodbye!");
        } else if (calcChoice == 2) {
            solution = inputOne - inputTwo;
            System.out.println("The result of the operation is " + solution + ". Goodbye!");
        } else if (calcChoice == 3) {
            solution = inputOne * inputTwo;
            System.out.println("The result of the operation is " + solution + ". Goodbye!");
        } else if (calcChoice == 4) {
            solution = inputOne / inputTwo;
            System.out.println("The result of the operation is " + solution + ". Goodbye!");
        } else {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
    }
}

