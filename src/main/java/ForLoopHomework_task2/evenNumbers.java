package ForLoopHomework_task2;

import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = input.nextInt();

        int count = 0;

        System.out.println("Even Numbers: ");

        for(int i = 1; i <= N; i++ ){
            if (i % 2 == 0){
                System.out.print(i + " ");

                count++;
            }

            }
                System.out.println();
                System.out.println("count: " + count);
        }
    }

