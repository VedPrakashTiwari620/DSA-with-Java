class SecondLargest {

    public static int secondLar(int arr[]){

        int max=Integer.MIN_VALUE;
        int secLar=Integer.MIN_VALUE;


        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==max) {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>secLar) {
                secLar=arr[i];
            }
        }

        return secLar;
    }

    public static void main(String[] args) {
        int arr[]= {0,-2,0,-3,0,-4};


        int secLar=SecondLargest.secondLar(arr);
        System.out.println("The second largent element is in the array is "+secLar);
    }
}
