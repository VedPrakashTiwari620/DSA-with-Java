class Sort_Zero {

    static void sortZero(int arr[]){

        int n = arr.length;
        for (int i = 0; i < n-1; i++) {

            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }

                if (flag=false) return;
            }
        }
    }

    public static void main(String[] args) {
        //Sort an array zero at the end


        int arr[]= {0, 0, 0, 0, 0, 2, 0, 1};

        sortZero(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
