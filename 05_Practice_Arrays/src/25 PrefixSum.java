class PrefixSum {

    static int[] makePrefixSumArray(int arr[]){
        int pref[]=new int[arr.length];
        pref[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i]=pref[i-1]+arr[i];

        }


        return pref;
    }

    static void prefixSumArrWithoutCreateNewArr(int arr[]){

        for (int i=1;i<arr.length;i++) {
            arr[i] += arr[i - 1];
        }

        PrintArrayElement.print1DArr(arr);
    }

    public static void main(String[] args) {
        /*
        Given an integer array 'a' return the prefix sum/running sum in the array without crating a new array.
         */

        int arr[]=new int[]{1,2,3,4,5};
//        int pref[]=makePrefixSumArray(arr);
//        PrintArrayElement.print1DArr(pref);
        prefixSumArrWithoutCreateNewArr(arr);
    }
}
