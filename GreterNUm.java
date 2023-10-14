// a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class GreterNUm {
    public static int calculateGraterNumber(int num1, int num2) {

        int greater = 0;
        if (num1 > num2) {
            greater = num1;
            return greater;
        } else
            greater = num2;
        return greater;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int result = calculateGraterNumber(num1, num2);
        System.out.println("Gratest number among 2 numbers is :" + result);

    }
}
