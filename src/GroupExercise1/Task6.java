package GroupExercise1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to check(prime or NOT):");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Number " + number + " is NOT a prime");
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("Number " + number + " is NOT a prime");
                    return;
                }
            }
            System.out.println("Number " + number + " is a prime");
        }
    }
}
