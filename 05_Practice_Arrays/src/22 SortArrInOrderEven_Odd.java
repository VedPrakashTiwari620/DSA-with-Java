class SortArrInOrderEven_Odd {

    static void swap(int arr[], int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortInEvenOdd(int arr[]){
        int i=0;
        int n=arr.length;
        int j=n-1;

        while (i<j){
            if (arr[i]%2==1 && arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if (arr[i]%2==0) i++;
            if (arr[j]%2==1) j--;

        }
    }


    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};


        sortInEvenOdd(arr);
        PrintArrayElement.print1DArr(arr);



    }
}
