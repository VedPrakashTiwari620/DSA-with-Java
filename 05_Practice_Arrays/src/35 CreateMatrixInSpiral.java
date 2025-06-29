import java.util.Scanner;

class CreateMatrixInSpiral {



    public static void returnElementOfSpiral(int arr[][],int r, int c){
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

    public static int[][] createSpiral(int n){
        int sprMatrix[][] = new int[n][n];


        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int curr=1;

        while (curr <= n*n ){

            //topRow -> leftCol to rightCol
            for (int j=leftCol; j<=rightCol && curr <= n*n;j++){
                sprMatrix[topRow][j]=curr++;

            }
            topRow++;
            //rightCol -> topRow to bottomRow
            for (int i=topRow; i<=bottomRow && curr <= n*n;i++){
                sprMatrix[i][rightCol]=curr++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for (int j=rightCol; j>=leftCol && curr <= n*n;j--){
                sprMatrix[bottomRow][j]=curr++;

            }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            for (int i=bottomRow; i>=topRow && curr <= n*n;i--){
                sprMatrix[i][leftCol]=curr++;

            }
            leftCol++;

        }

        return sprMatrix;
    }


    public static void main(String[] args) {
        System.out.println("Enter the integer n to to create nXn matrix in 1 to n^2 in spiral order.");
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();

        int sprMatrix[][] = createSpiral(n);

//        for (int[] matrix : sprMatrix) {
//            for (int i : matrix) {
//                System.out.print(i+" ");
//            }
//        }


        returnElementOfSpiral(sprMatrix,n,n);


    }
}
