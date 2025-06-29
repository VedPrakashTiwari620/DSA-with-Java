import java.util.Scanner;

public class Main {

    static void printN(int num){
        if (num==1){
            System.out.print(1+" ");
            return;
        }

        printN(num-1);
        System.out.print(num+" ");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Natural number to print to Number to 1: ");
        int num = input.nextInt();

        printN(num);



    }
}