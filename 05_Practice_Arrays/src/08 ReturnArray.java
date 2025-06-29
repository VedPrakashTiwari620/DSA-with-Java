class ReturnArray {

    public static int[] array1(int arr[]){
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;


        int arr1[]=new int[2];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min) min=arr[i];
            if (arr[i]>max) max=arr[i];
        }
        arr1[0]=min;
        arr1[1]=max;

        return arr1;
    }

    public static void main(String[] args) {
        System.out.println("Return a Array with two element oth element is lowest element 1st index on highest element ");
        int arr[]={5,8,1,3,6,2};


        int arr1[]=ReturnArray.array1(arr);
        for (int i:arr1){
            System.out.print(i+" ");
        }




    }
}
