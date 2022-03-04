import java.util.Scanner;
import java.lang.Math;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currentResult = 0;
        double totalResult = 0;
        double numberCalcs = 0;
        int menuSelection = 1;
        System.out.println("Current Result: " + numberCalcs);
/*        System.out.println("Current Result: " + totalCalc);
        System.out.println();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println();
        System.out.print("Enter Menu Selection: ");
        int menuSelection = input.nextInt();*/


        while (true) {
            if((menuSelection != 7)&&((menuSelection >= 1 && menuSelection <= 6))) {

                System.out.println();
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println();
            }
                System.out.print("Enter Menu Selection: ");
                menuSelection = input.nextInt();
                numberCalcs = numberCalcs + 1;


            while (true) {

                switch (menuSelection) {
                    case 1:
                        System.out.print("Enter first operand: "/* + String.format("%.1f", firstOp)*/);
                        double firstOp = input.nextDouble();
                        System.out.print("Enter second operand: "/* + String.format("%.1f", secondOp)*/);
                        double secondOp = input.nextDouble();
                        System.out.println();
                        currentResult = firstOp + secondOp;
                        double roundResult = Math.round(currentResult * 100.0) / 100.0;
                        System.out.println("Current Result: " + roundResult);
                        totalResult = totalResult + currentResult;
                        break;
                    case 2:
                        System.out.print("Enter first operand: "/* + String.format("%.1f", firstOp)*/);
                        firstOp = input.nextDouble();
                        System.out.print("Enter second operand: "/* + String.format("%.1f", secondOp)*/);
                        secondOp = input.nextDouble();
                        System.out.println();
                        currentResult = firstOp - secondOp;
                        roundResult = Math.round(currentResult * 100.0) / 100.0;
                        System.out.println("Current Result: " + roundResult);
                        totalResult = totalResult + currentResult;
                        break;
                    case 3:
                        System.out.print("Enter first operand: "/* + String.format("%.1f", firstOp)*/);
                        firstOp = input.nextDouble();
                        System.out.print("Enter second operand: "/* + String.format("%.1f", secondOp)*/);
                        secondOp = input.nextDouble();
                        System.out.println();
                        currentResult = firstOp * secondOp;
                        roundResult = Math.round(currentResult * 100.0) / 100.0;
                        System.out.println("Current Result: " + roundResult);
                        totalResult = totalResult + currentResult;
                        break;
                    case 4:
                        System.out.print("Enter first operand: "/* + String.format("%.1f", firstOp)*/);
                        firstOp = input.nextDouble();
                        System.out.print("Enter second operand: "/* + String.format("%.1f", secondOp)*/);
                        secondOp = input.nextDouble();
                        System.out.println();
                        currentResult = firstOp / secondOp;
                        roundResult = Math.round(currentResult * 100.0) / 100.0;
                        System.out.println("Current Result: " + roundResult);
                        totalResult = totalResult + currentResult;
                        break;
                    case 5:
                        System.out.print("Enter first operand: "/* + String.format("%.1f", firstOp)*/);
                        firstOp = input.nextDouble();
                        System.out.print("Enter second operand: "/* + String.format("%.1f", secondOp)*/);
                        secondOp = input.nextDouble();
                        System.out.println();
                        currentResult = Math.pow(firstOp, secondOp);
                        roundResult = Math.round(currentResult * 100.0) / 100.0;
                        System.out.println("Current Result: " + roundResult);
                        totalResult = totalResult + currentResult;
                        break;
                    case 6:
                        System.out.print("Enter first operand: "/* + String.format("%.1f", firstOp)*/);
                        firstOp = input.nextDouble();
                        System.out.print("Enter second operand: "/* + String.format("%.1f", secondOp)*/);
                        secondOp = input.nextDouble();
                        System.out.println();
                        currentResult = Math.log(secondOp) / Math.log(firstOp);
                        System.out.println("Current Result: " + currentResult);
                        totalResult = totalResult + currentResult;
                        break;
                    case 7:
                        if (numberCalcs == 1) {
                            System.out.println();
                            System.out.println("Error: No calculations yet to average!");
                            numberCalcs = numberCalcs - 1;
                        } else {
                            numberCalcs = numberCalcs - 1;
                            /*double roundTotalResult = Math.round(totalResult);*/
                            System.out.println("Sum of calculations: " + totalResult);
                            int roundNumCalc;
                            roundNumCalc = (int)(numberCalcs);
                            System.out.println("Number of calculations: " + roundNumCalc);
                            double averageCalc = Math.round((totalResult / numberCalcs) * 100.0) / 100.0;
                            System.out.println("Average of calculations: " + averageCalc);
                            break;
                        }

                }
                if (menuSelection >= 8 || menuSelection <= -1) {
                    System.out.println("Error: Invalid selection!");
                    numberCalcs = numberCalcs - 1;
                    System.out.println();
                    System.out.println("");
                }

                if (menuSelection == 0) {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                }
                break;
            }    //end bracket for while loop//
        }
    }
}


//double.parDouble or something for the extra credit case
//fix the while loops and add another
