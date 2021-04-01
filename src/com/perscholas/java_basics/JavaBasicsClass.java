package com.perscholas.java_basics;

import java.util.Scanner;

public class JavaBasicsClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int operation;
        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("1. Add 2 integers");
            System.out.println("2. Add 2 double variables");
            System.out.println("3. Add integer and double variable");
            System.out.println("4. Perform integer division and double conversion");
            System.out.println("5. Perform double division and integer conversion");
            System.out.println("6. Perform integer to double casting");
            System.out.println("7. Declare named constant and use in calculation");
            System.out.println("8. Cafe ordering");
            System.out.println("9. Seconds to minute conversion");
            System.out.println("10. Fahrenheit to celsius conversion");
            System.out.println("11. Compute monthly loan payments");
            System.out.println("12. Exit");
            System.out.println("Please select one of the operation to perform : ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    integerAddition();
                    break;
                case 2:
                    doubleAddition();
                    break;
                case 3:
                    intAndDoubleAddition();
                    break;
                case 4:
                    intAndDoubleDivision();
                    break;
                case 5:
                    doubleToIntCasting();
                    break;
                case 6:
                    intToDoubleCasting();
                    break;
                case 7:
                    usingConstants();
                    break;
                case 8:
                    cafeOrdering();
                    break;
                case 9:
                    minuteCalculation();
                    break;
                case 10:
                    temperatureConversion();
                    break;
                case 11:
                    computeLoanPayment();
                    break;
                case 12:
                    break;
                default:
                    System.out.println("ERROR : Please select valid operation");
            }
        }while (operation != 12);
    }

    /*Write a program where you create 3 variables that represent products at a cafe.
       The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
       Assign prices to each product. Create 2 more variables called subtotal and totalSale and
       complete an “order” for 3 items of the first product, 4 items of the second product, and
       2 items of the third product. Add them all together to calculate the subtotal. Create a constant
       called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
       Be sure to format the results to 2 decimal places.*/
    private static void cafeOrdering() {
        System.out.println("------------Cafe Ordering----------");
        final double SALES_TAX = 7;
        double coffee = 5, cappuccino = 6, greenTea = 3, subtotal, totalSale;
        subtotal = (coffee * 3) + (cappuccino * 4) + (greenTea * 2);
        totalSale = subtotal + ((SALES_TAX / 100) * subtotal);
        System.out.println("Total sale amount : " + String.format("%.2f", totalSale));
    }

    //Write a program that declares a named constant and uses it in a calculation. Print the result.
    private static void usingConstants() {

        final double PI = 3.1416;
        System.out.println("--------Circle Area Calculation---------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double radius = input.nextDouble();
        double area = PI * radius * radius;
        System.out.println("Area of Circle : " + area);
    }

    /*Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q.Print q again.*/
    private static void intToDoubleCasting() {

        System.out.println("\n\n------Integer Division------------");
        int x = 5, y = 6;
        double q = y / x;
        System.out.println(y + " / " + x + " = " + q);
        q = (double) y;
        System.out.println(q);
    }

    /*Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
        Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.*/
    private static void doubleToIntCasting() {

        System.out.println("\n\n------Double Division------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Decimal Number : ");
        double num1 = input.nextDouble();
        System.out.print("\nEnter Second Decimal Number : ");
        double num2 = input.nextDouble();
        double divResult = (num1 > num2) ? (num1 / num2) : (num2 / num1);
        System.out.println(num1 + " / " + num2 + " = " + divResult);

        int result = (int) divResult;
        System.out.println("Result in Integer form : " + result);
    }

    /*Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number
         by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number
         to a decimal. What happens? What corrections are needed?*/
    private static void intAndDoubleDivision() {

        int num7, num8, divResult;
        num7 = 10;
        num8 = 5;
        divResult = num7 / num8;
        System.out.println("\n\n------Integer Division------------");
        System.out.println(num7 + " / " + num8 + " = " + divResult);
        double num9 = 10.5;
        double doubleDivResult;
        doubleDivResult = num9 / num8;
        System.out.println("\n\n------Double Division------------");
        System.out.println(num9 + " / " + num8 + " = " + doubleDivResult);
    }

    /*Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        Assign the sum to a variable. Print out the result. What variable type must the sum be?*/
    private static void intAndDoubleAddition() {

        System.out.println("\n\n------Integer and Double Addition------------");
        int num5 = 1;
        double num6 = 3.5;
        double intDoubleResult = num5 + num6;
        System.out.println(num5 + " + " + num6 + " = " + intDoubleResult);
    }

    /*Write a program that declares 2 double variables, assigns a number to each, and adds them together.
        Assign the sum to a variable. Print out the result.*/
    private static void doubleAddition() {

        System.out.println("\n\n------Double Addition------------");
        double num3 = 2.2, num4 = 3.8, doubleResult;
        doubleResult = num3 + num4;
        System.out.println(num3 + " + " + num4 + " = " + doubleResult);
    }

    /*Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
         Assign the sum to a variable. Print out the result.*/
    private static void integerAddition() {

        System.out.println("-------Integer Addition---------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Integer : ");
        int num1 = input.nextInt();
        System.out.print("\nEnter Second Integer : ");
        int num2 = input.nextInt();
        int intResult = num1 + num2;
        System.out.println("\n" + num1 + " + " + num2 + " = " + intResult);
    }

    // Computes monthly loan payments
    private static void computeLoanPayment() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter below details to calculate your monthly payment");
        System.out.println("Enter Interest Rate : ");
        double interestRate = (input.nextDouble() / 100) / 12;
        System.out.println("Enter number of years : ");
        double years = input.nextDouble();
        System.out.println("Enter loan amount : ");
        double loanAmt = input.nextDouble();
        double monthlyPayment = ((loanAmt * interestRate) / (1.0 - (1.0 / Math.pow((1.0 + interestRate), (years * 12.0)))));
        System.out.println("Monthly Payment : " + monthlyPayment);
    }

    //converts Fahrenheit to celsius
    private static void temperatureConversion() {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("--------Converts Temperature from Fahrenheit to Celsius--------");
        System.out.println("Enter the temperature in Fahrenheit : ");
        fahrenheit = input.nextInt();
        celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
        System.out.println("Temperature in Celsius : " + String.format("%.2f", celsius));
        //System.out.println(new DecimalFormat("#.##").format((100*0.08875)));
    }

    // converts seconds to minutes
    private static void minuteCalculation() {
        int seconds = 130;
        System.out.println("---------Conversion of seconds to minutes----------");
        System.out.println(seconds / 60 + "min " + seconds % 60 + "sec ");
    }
}
