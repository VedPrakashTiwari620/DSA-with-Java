public class InsertionSort1 {


    static void insertionSort(int arr[]){
        int n= arr.length;

        for (int i =1; i<n; i++){

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
        int arr[] = {1,2,1,3,1};

        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
