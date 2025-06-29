class IsSortedArray {

    static boolean isSorted(int[] arr , int index){

        if(index==arr.length-1) return true;  // base case

//        if((index+1)<arr.length && arr[index]>arr[index+1]) return false;

        if (arr[index]>arr[index+1]) return false;

        return isSorted(arr, index+1);   // recursive work
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int arr1[] = new int[]{1,22,3,4,5,6};

        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr1,0));
    }
}
