package ForLoopHomework_task6;
import java.util.Scanner;

public class findingPrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        if (N < 2 ){
            System.out.print("Error");
            return;
        }
        for(int i = 2; i <= N; i++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }

            }
                if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
