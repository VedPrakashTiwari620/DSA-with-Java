class SortArrayConsisting0_1 {

    static void sortMethod(int arr[]){
        int n=arr.length;

        int countZero=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0){
                countZero++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i<countZero){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    static void swap(int arr[], int i, int j){
        int temp;

        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void sortWithTwoPointer(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i<j){
            if (arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if (arr[i]==0){
                i++;
            }


            if (arr[j]==1){
                j--;
            }
        }



    }
    public static void main(String[] args) {
        //Write a program to sort an array consisting of 0 and 1.
        int arr[]=new int []{0,1,0,0,0,1,0,1,1,0};

//        sortMethod(arr);
        sortWithTwoPointer(arr);

        for (int k=0;k< arr.length;k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();

    }
}
