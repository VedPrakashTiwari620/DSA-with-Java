import java.util.Scanner;

class SumOfRectanglePrefOverColumn {


    public static void prefixSum(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j]+=arr[i][j-1];
            }
        }
    }


    public static void prefOverColumn(int prefArr[][]){
        for (int i = 1; i < prefArr.length; i++) {
            for (int j = 0; j < prefArr[i].length; j++) {
                prefArr[i][j]+=prefArr[i-1][j];
            }
        }
    }


    public static int sumOfRectangle(int prefArr[][], int l1, int r1, int l2, int r2){
        int ans=0, sum =0, left =0, up=0, leftUp=0;

        sum = prefArr[l2][r2];
        if(r1 >= 1){
            left=prefArr[l2][r1-1];
        }
        if (l1>=1) {
            up=prefArr[l1-1][r2];
        }
        if (l1>=1 && r1>=1){
           leftUp=prefArr[l1-1][r1-1];
        }

        ans=sum-up-left+leftUp;



        return ans;
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

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        System.out.println();

        prefixSum(arr);


        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        System.out.println();

        prefOverColumn(arr);

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        System.out.println();

        int sum = sumOfRectangle(arr,l1,r1,l2,r2);
        System.out.println("Sum of the Boundaries: "+sum);

    }
}
