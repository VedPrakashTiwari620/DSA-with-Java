public class InsertionSort {


    static void insertionSort(int arr[]){

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int j = i;

            while (j>0 && arr[j] < arr[j-1]){

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,1,0,6,5,8};
        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
