import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class Factorial {

    static int fact(int n){

        //base case
        if (n<0){
            System.out.println("Enter valid number to find factorial.");
            return -1;
        }

        //base case
        if (n==0){
            return 1;
        }

        // smaller problem - recursive work
        int smallAns = fact(n-1);


        //big problem - self work
        int ans = n * smallAns;





        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no to find the factorial:");
        int num = input.nextInt();

        int factorial = fact(num);


        System.out.printf("Factorial of the number %d is %d.",num,factorial);
    }
}
