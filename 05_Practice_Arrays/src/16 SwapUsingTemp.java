import java.util.Scanner;



class SwapUsingTemp {

    static void swap(int num1, int num2){

        int temp;
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Num1:"+num1+" Num2:"+num2);


    }

    public static void main(String[] args) {

        //Write a program using temp variable
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Num1 :");
        int num1=input.nextInt();
        System.out.println("Enter the value of Num2 :");
        int num2=input.nextInt();


        swap(num1, num2);

    }
}
