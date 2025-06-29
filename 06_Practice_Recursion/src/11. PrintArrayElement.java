class PrintArrayElement {

    static void print(int arr[], int i){
        if (i > arr.length-1) return;

        System.out.println(arr[i]);
        print(arr,i+1);
    }
 
    public static void main(String[] args) {
        //Given an array, print all its values recursively.

        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};

        print(arr,0);


    }
}
