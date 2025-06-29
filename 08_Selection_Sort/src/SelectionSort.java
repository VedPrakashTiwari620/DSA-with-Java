public class SelectionSort {

    static void selectionSort(int arr[]){

        int n= arr.length;

        for (int i = 0; i < n-1; i++) {

            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]){
                    min=j;
                }
            }


            if (min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int arr[]  = {3,2,1,4};

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
