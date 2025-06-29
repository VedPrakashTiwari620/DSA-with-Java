class SecondSmallest {

    public static int secondSmal(int arr[]){

        int min=Integer.MAX_VALUE;
        int secSmal=Integer.MAX_VALUE;


        for (int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }

            if (arr[i]==min)arr[i]=Integer.MAX_VALUE;
        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==max) {
//                arr[i]=Integer.MIN_VALUE;
//            }
//        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]<secSmal) {
                secSmal=arr[i];
            }
        }

        return secSmal;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};


        int secLar=SecondSmallest.secondSmal(arr);
        System.out.println("The second largent element is in the array is "+secLar);
    }
}
