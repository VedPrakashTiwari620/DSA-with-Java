import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        //Brute-Force Approach

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number to find gcd: ");
        int x = input.nextInt();
        int y = input.nextInt();

        int min = Integer.min(x,y);
        int max = Integer.max(x,y);
        int gcd=1;
        int min1=min;
        while (min1>1){
            if (max%min1==0 && min%min1==0){
                gcd = min1;
                break;
            }
            min1--;
        }

        System.out.println(gcd);
    }
}
