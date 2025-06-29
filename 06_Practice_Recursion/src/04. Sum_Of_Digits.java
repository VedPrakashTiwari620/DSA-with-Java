import java.util.Scanner;

class Sum_Of_Digits {

    public static int sumOfDigit(int num){
        if (num>=0 && num<=9) return num;
        return sumOfDigit(num/10)+num%10;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number greater than 1 digits to find sum of digits.");
        int num = input.nextInt();

        System.out.println(sumOfDigit(num));

    }
}
