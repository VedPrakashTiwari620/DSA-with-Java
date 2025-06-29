import java.util.Scanner;

class KMultiplesGivenNumber {

    static void kMultiple(int n, int k){
        if (k==0){
            return;
        }
        kMultiple(n, k-1);
        System.out.print((n*k)+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n and the multiples k :");
        int n= input.nextInt();
        int k= input.nextInt();

        kMultiple(n,k);

    }
}
