import java.util.Scanner;

class Digit_Count {

    public static int countDigit(int num){
        if(num<=0) return 0;

        return countDigit(num/10) + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number greater than 1 digits to find count of digits.");
        int num = input.nextInt();

        System.out.println(countDigit(num));
    }
}
