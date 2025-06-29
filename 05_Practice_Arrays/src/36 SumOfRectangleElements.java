import java.util.Scanner;

class SumOfRectangleElements {

    public static class SumOFRec {

        public static int returnSum(int arr[][], int l1, int r1, int l2, int r2){
            int sum=0;

            for (int i = l1; i <= l2; i++) {
                for (int j = r1; j <= r2; j++) {
                    sum+=arr[i][j];
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


            System.out.println("Enter the two coordinate ");
            int l1= input.nextInt();
            int r1= input.nextInt();
            int l2= input.nextInt();
            int r2 = input.nextInt();

            int sum= returnSum(arr,l1,r1,l2,r2);
            System.out.printf("Sum of rectangle is %d",sum);
        }
    }
}
