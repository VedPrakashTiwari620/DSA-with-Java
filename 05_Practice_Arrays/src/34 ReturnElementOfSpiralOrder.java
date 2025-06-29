import java.util.Scanner;

class ReturnElementOfSpiralOrder {


    static void returnElementOfSpiral(int arr[][],int r, int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElement=0;

        while (totalElement<r*c){
            // top row -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < r*c; j++) {
                if (totalElement < r*c) {

                    System.out.print(arr[topRow][j] + " ");
                    totalElement++;
                }
            }

            topRow++;

            // right col -> topRow to bottomRow
            for (int i= topRow; i <= bottomRow && totalElement < r*c; i++){
                if (totalElement < r*c) {
                    System.out.print(arr[i][rightCol] + " ");
                    totalElement++;
                }
            }

            rightCol--;
            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r*c; j--) {
                if (totalElement < r*c) {
                    System.out.print(arr[bottomRow][j] + " ");
                    totalElement++;
                }
            }

            bottomRow--;
            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r*c; i-- ) {
                if ( totalElement < r*c) {
                    System.out.print(arr[i][leftCol] + " ");
                    totalElement++;
                }
            }

            leftCol++;

        }










//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the row and col of the Matrix");
        int row=input.nextInt();
        int col= input.nextInt();

        System.out.println("Enter Matrix elements: ");
        int arr[][]=new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j =0; j<col;j++){
                arr[i][j]=input.nextInt();
            }
        }

        returnElementOfSpiral(arr,row,col);



    }
}
