
//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class AverageNum {

    public static int calculateAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        return average;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number : ");

            int num2 = sc.nextInt();
            System.out.println("Enter the third number : ");

            int num3 = sc.nextInt();

            int result = calculateAverage(num1, num2, num3);
            System.out.println(" Average of the given number is " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
