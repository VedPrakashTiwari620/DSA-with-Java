import java.util.Scanner;

class SumOfRectangleUsingPrefixSum {

    public static void prefixSum(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    public static int sumRect(int arr[][], int l1, int r1, int l2, int r2){
        int sum=0;
        for (int i = l1; i <= l2; i++) {

            if (r1<1){
                sum+=arr[i][r2];
            }else {
                sum+=arr[i][r2]-arr[i][r1-1];
            }


        }


        return sum;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of rectangle.");
        int r= input.nextInt();
        int c= input.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the "+(r*c)+" elements of an array.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=input.nextInt();
            }
        }


        System.out.println("Enter the Rectangle Boundaries:  ");
        int l1= input.nextInt();
        int r1= input.nextInt();
        int l2= input.nextInt();
        int r2 = input.nextInt();


        prefixSum(arr);

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }


        int sum = sumRect(arr, l1, r1, l2, r2);
        System.out.println("Sum of the Rectangle : "+sum);
    }
}
