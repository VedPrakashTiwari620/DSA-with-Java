class PrintTarIndex {

    static void printInd(int arr[], int tar, int ind){

        if(ind == arr.length){
            return;
        }


        if(arr[ind]==tar){
            System.out.print(ind+" ");
        }

        printInd(arr,tar,ind+1);
    }


    public static void main(String[] args) {
        //Given an array of size N and an integer X. The task is to find all indices of the integer X in the array.
        int arr[] = new int[]{2,3,2,2,2,2,2};
        int tar = 2;

        printInd(arr,tar,0);
    }
}
