class TransposeMatrix {



    static int[][] transpose(int arr[][], int r, int c){
        int ans[][]=new int[c][r];
        for (int i=0; i<c;i++){
            for (int j = 0; j < r; j++) {
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static int[][] transposeWithoutExtr(int arr[][], int r, int c){

        for (int i=0; i<c;i++){
            for (int j = i; j < r; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Transpose Matrix");

        int arr[][]={
                {1,2,3},{1,2,3},{1,2,3}
        };

        int r=3;
        int c=3;
//        int ans[][]=transpose(arr,r,c);

        int ans[][]=transposeWithoutExtr(arr,r,c);
        for (int a[]:ans){
            for (int i : a) {
                System.out.print(i+" ");
            }
            System.out.println();
        }




    }
}
