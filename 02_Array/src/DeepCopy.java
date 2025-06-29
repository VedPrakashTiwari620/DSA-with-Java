import java.util.Arrays;

public class DeepCopy {

    static void printArr(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
//      This type of copy is called HARD COPY
        int arr2[] =arr1.clone();
        arr2[0]=0;
        arr2[1]=0;
//        arr2[2]=0;

        printArr(arr1);
        printArr(arr2);
        int arr3[]= Arrays.copyOf(arr1,arr1.length);
        printArr(arr3);

        int arr4[]= Arrays.copyOf(arr1,4);
        printArr(arr4);


        int arr5[]= Arrays.copyOfRange(arr1,0,arr1.length);
        printArr(arr5);

        int arr6[]= Arrays.copyOfRange(arr1,2,5);
        printArr(arr6);

    }
}
