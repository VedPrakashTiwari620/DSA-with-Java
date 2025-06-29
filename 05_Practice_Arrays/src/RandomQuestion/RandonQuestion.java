package RandomQuestion;

import java.util.Scanner;

public class RandonQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number n1 adn n2 where n1>n2 :");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.print((n1 * i) - (n2 * i));

            i++;
        }
    }
}
