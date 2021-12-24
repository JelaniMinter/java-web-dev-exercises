package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles driven?:");
        int miles = input.nextInt();
        System.out.println("The amount of gas consumed?:");
        int gallons = input.nextInt();
        System.out.println("Your miles per gallon(mpg) is: " + miles / gallons);
    }
}
