import java.util.Scanner;

class PascalsTriangle {

    static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int ans[][]=new int[n][];

        for (int i = 0; i < n; i++) {
            //ith row has i+1 column
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;

            for (int j = 1; j < i; j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows of Pascal Triangle:");
        int n= input.nextInt();

        int ans[][]=pascal(n);
        printMatrix(ans);

    }
}
