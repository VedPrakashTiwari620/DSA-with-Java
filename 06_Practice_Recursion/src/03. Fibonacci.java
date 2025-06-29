import java.util.Scanner;

class Fibonacci {

    static int fib(int n){

        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
             System.out.print(fib(i)+" ");
        }
        System.out.println();

        System.out.println("Enter the number to find nth fibonacci: ");
        int num = input.nextInt();

        int fib = fib(num);
        System.out.println("Nth term of fibonacci is : "+ fib);
    }

}
