package ForLoopHomework_task5;

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        if (height < 2 || width < 2){
            System.out.print("Error");
            return;
        }
        for (int row = 1; row <= height; row++ ){
            for(int col =1; col<= width; col++){

                if (row == 1 || row == height || col == 1 || col == width){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }

            }
            System.out.println ();

        }

    }
}
