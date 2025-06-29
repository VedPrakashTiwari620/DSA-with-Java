import java.util.Scanner;

class ReverseEachRow {

//    static void swap(int a[][], int i, int j, int c){
//        int temp;
//        int k=c-1;
//
//            temp=a[i][j];
//            a[i][j]=a[i][k];
//            a[i][j]=temp;
//    }

    static void reverse(int a[][], int r, int c){

        for (int i = 0; i < r; i++) {

                int left = 0, right = c - 1;
                while (left < right) {
                    // Swap elements
                    int temp = a[i][left];
                    a[i][left] = a[i][right];
                    a[i][right] = temp;
                    left++;
                    right--;
                }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

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

        reverse(a,r1,c1);

    }
}
