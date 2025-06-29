class FindTargetEle {


    //Return true or false if target present or not
    static boolean findTar(int arr[], int tar, int ind){
        //Base case
        if(ind == arr.length) return false;


        //Self work
        if (arr[ind]==tar) return true;

//        //Recursive work
//        if(findTar(arr,tar,ind+1)) return true;
//
//        return false;

        return findTar(arr, tar, ind+1);
    }



    //Return index if target present
    static int findInd(int arr[], int tar, int ind){
        //Base case
        if(ind == arr.length) return -1;


        //Self work
        if (arr[ind]==tar) return ind;

//        //Recursive work
//        if(findTar(arr,tar,ind+1)) return true;
//
//        return false;

        return findInd(arr, tar, ind+1);
    }

    public static void main(String[] args) {
        //Find an array of integers and a target value x. Print whether x exists in array or not.

        int arr[]  = new int[]{2,5,6,8,3,4};
        int tar = 8;
        //Print true or false if target present or not
        System.out.println(findTar(arr,tar,0));


        //Return ind if present otherwise return -1
        System.out.println(findInd(arr,8,0));
    }
}
