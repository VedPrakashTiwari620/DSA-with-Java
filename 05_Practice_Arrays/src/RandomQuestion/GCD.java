package RandomQuestion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        /*
        Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number to find the GCD:");
        int n1 = input.nextInt();
        int n2= input.nextInt();



        int min=Math.min(n1,n2);
        for(int i=min; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
//        int gcd = 1;
//        for (int i = 2; i <= min ; i++) {
//
//
//            if(n1%i==0 && n2%i==0){
//                gcd=i;
//                break;
//            }
//        }
//
//        int i=2;
//        int gcd=1;
//        while (i<=min){
//            if (n1%i==0 && n2%i==0){
//                gcd=i;
//                break;
//            }
//
//
//            i++;
//        }
//
//
//
//        System.out.println(gcd);

    }
}
