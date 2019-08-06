package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {

        //Get the number of hours worked
        System.out.println("Please enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();


        //Get the hourly rate
        System.out.println("Please enter the employee's pay rate");
        double rate = 0;
        try {
            rate = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect number structure");
            e.printStackTrace();
            System.exit(-1);
        }

        //Multiply hours and pay rate
        double salary = rate * hoursWorked;

        //Display information

        System.out.println("The grosspay for the employee is " + salary);


    }

}
