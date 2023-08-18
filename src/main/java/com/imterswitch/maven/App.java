package com.imterswitch.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = Arithmetic.add(num1, num2);
                break;
            case '-':
                result = Arithmetic.subtract(num1, num2);
                break;
            case '*':
                result = Arithmetic.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = Arithmetic.divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();

    }




    }

