import java.util.Scanner;


class RaisePower {

//    static int raiseP(int n, int p){
//        if(p==0){
//            return 1;
//        }
//        return n * raiseP(n,p-1);
//    }

    static int power(int n, int p){
        if(p==0){
            return 1;
        }

        int smallAns = power(n,p/2);

        if(p%2==0){
            return smallAns * smallAns;
        }
        return smallAns*smallAns*n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number and the power:");
        int num=input.nextInt();
        int pow = input.nextInt();


//        int rP = raiseP(num,pow);
//        System.out.println(rP);

        int rP1 = power(num,pow);
        System.out.println(rP1);

    }
}
