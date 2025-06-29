import java.util.Scanner;

class rotateMatrixWithoutExtra {

    static void transpose(int arr[][], int row){
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }


    static void rotate(int arr[][], int row, int col){
        transpose(arr,row);


        System.out.println("Transpose Array");
        for (int ar[]:arr){
            for (int i : ar) {
                System.out.print(i+" ");
            }
            System.out.println();
        }




        for (int i = 0; i < row; i++) {
            int left=0;
            int right=arr.length-1;

            while (left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }




        for (int ar[]:arr){
            for (int i : ar) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Transpose Matrices Without using Extra Arrays:");
        System.out.println("Enter the row and column of the array");
        int row=input.nextInt();
        int col=input.nextInt();

        System.out.println("Enter the "+(row*col)+" elements: ");
        int arr[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=input.nextInt();
            }
        }




        rotate(arr,row,col);

    }
}
