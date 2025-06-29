class Selection_Sort {

    static void selectionSort(int arr[]){


        for (int i = 0; i < arr.length-1; i++) {

            int min = i;
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }

            // swap current element and minimum element -->
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }



    }

    public static void main(String[] args) {
        int arr[] = {5,3,1,3,6};


        selectionSort(arr);


        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
