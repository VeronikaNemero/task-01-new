package by.training.vnemero.task01;

import java.util.Scanner;

public class Input {

    public int scannerInputTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four-digits number: ");
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Incorrect input! Try again!");
            System.out.print("Enter four-digits number: ");
        }
        return scanner.nextInt();
    }

    public double scannerInputTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Incorrect input! Try again!");
            System.out.print("Enter value: ");
        }
        return scanner.nextDouble();
    }

    public double scannerInputTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of the leg: ");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Incorrect input! Try again!");
            System.out.print("Enter value of the leg: ");
        }
        return scanner.nextDouble();
    }

    public int scannerInputTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coordinate: ");
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Incorrect input! Try again!");
            System.out.print("Enter coordinate: ");
        }
        return scanner.nextInt();
    }

}
