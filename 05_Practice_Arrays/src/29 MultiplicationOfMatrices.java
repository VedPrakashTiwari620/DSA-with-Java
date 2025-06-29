import java.util.Scanner;

class MultiplicationOfMatrices {

    static void multiplication(int a[][] , int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2){
            System.out.println("Multiplication Not Possible -- wrong input.");
            return;
        }
        int mul[][]= new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 Matrices");


        for (int i=0; i < r1; i++){
            for (int j = 0; j < c2; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c2; j++) {
//                for (int k=0; k < c1; k++){
//                    /*
//                    mul[i][j]= ith row of a * jth col of b
//                     */
//                    mul[i][j]+=(a[i][k] * b[k][j]);
//                }
//
//            }
//
//        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no of row and col of 1st Matrices");
        int r1=input.nextInt();
        int c1= input.nextInt();
        int a[][]= new int[r1][c1];
        System.out.println("Enter the element "+(r1*c1)+" of 1st Matrices");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]=input.nextInt();
            }
        }



        System.out.println("Enter the no of row and col of 2nd Matrices");
        int r2=input.nextInt();
        int c2= input.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter the element "+(r2*c2)+" of 1st Matrices");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j]=input.nextInt();
            }
        }

        multiplication(a,r1,c1,b,r2,c2);


    }
}
