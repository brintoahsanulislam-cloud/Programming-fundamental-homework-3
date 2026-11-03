package ForLoopHomework_task3;

import java.util.Scanner;

public class factorialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = input.nextInt();
        int factorial = 1;

        if (N < 0 || N > 12) {
            System.out.print("Input not valid");
        } else {

            for (int i = 1; i <= N; i++) {

                factorial *= i;
            }
            System.out.println("factorial: " + factorial);
        }
    }
}
