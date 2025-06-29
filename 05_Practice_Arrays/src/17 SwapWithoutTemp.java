import java.util.Scanner;

class SwapWithoutTemp {
    public static void main(String[] args) {

        //Write  a program to swap using without temp
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the two number to swap using without temp variable/ using sum and difference method");
        int a=input.nextInt();
        int b= input.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("Num1 :"+a+" Num2 :"+b);

    }
}
