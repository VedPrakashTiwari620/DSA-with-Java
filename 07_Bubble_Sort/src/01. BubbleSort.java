class Main {

    static void bubbleSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {

            boolean flag = false;  // has any swapping happened

            for (int j = 0; j < n-1-i; j++) {
                /*
                last i element are already at correct sorted positions
                so no need to check them
                 */

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                    flag = true;   // some swap has performed
                }
            }

            if (flag == false){
                return;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,1,3,4,5};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}