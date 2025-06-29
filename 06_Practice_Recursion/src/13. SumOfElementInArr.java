class SumOfElementInArr {

    static int sumArr(int arr[], int ind){
        if (ind == arr.length){
            return 0;
        }
        return arr[ind]+sumArr(arr, ind+1);
    }

    public static void main(String[] args) {
        //Find the sum of the elements of the array [2,3,5,20,1]


        int arr[] = new int[]{2,3,5,20,1};
        int arr1[] = new int[]{};
        System.out.println(sumArr(arr,0));
        System.out.println(sumArr(arr1,0));



    }
}
