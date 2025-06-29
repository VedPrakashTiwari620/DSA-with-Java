import java.util.Scanner;

class PrintNatural {

    static void printN(int n){
        //base case
        if(n<1){
            System.out.println("Input is not valid.jjj");
            return;
        }
        //base case
        if(n<=1){
            System.out.printf("%d",n);
            return;
        }

        //self work
        System.out.printf("%d ",n);

        //smaller work, recursive work
        printN(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the Number to print Number to 1 :");
        int num=input.nextInt();

        printN(num);


    }
}
