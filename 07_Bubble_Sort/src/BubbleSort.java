public class BubbleSort {

    static void bubbleSort(int arr[]){
        int n= arr.length;


        for (int i = 0; i < n-1; i++) {

            boolean flag = false;

            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }
            if (flag == false){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {4,1,2,3};
        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
