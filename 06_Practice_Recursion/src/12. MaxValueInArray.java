class MaxValueInArray {

//    static int maxValue(int arr[], int ind, int max){
//
//
//        if(ind == arr.length){
//            System.out.println(max);
//            return max;
//        }
//        if (arr[ind]>max){
//            max = arr[ind];
//        }
//
//        maxValue(arr,ind+1, max);
//        return max;
//
//
//
//
//
//
//    }




    static int maxValue(int arr[], int ind){
        //base case
        if(ind == arr.length-1) return arr[ind];


        //small prb -> ind+1, end of the array -> max -> return
        int smallAns = maxValue(arr, ind+1);

        //self work and final ans
        return Math.max(arr[ind],smallAns);

    }

    public static void main(String[] args) {
        //Find the max value of the array [3,10,3,2,5]

        int arr[] = new int[]{3,10,3,13,2,5};
//        int max = Integer.MIN_VALUE;
//        int max = maxValue(arr, 0,0);
//        System.out.println(max);


        System.out.println(maxValue(arr,0));


    }
}
