import java.util.Scanner;

public class ShallowCopyArr {

    static void printArr(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    static void changeArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[]=new int[3];
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Original array");
        printArr(arr);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        int arr2[]=arr;
        System.out.println("Copied Array");
        printArr(arr2);



        changeArray(arr2);
        System.out.println("after changing copied array original array");
        printArr(arr);
        System.out.println("after changing copied array");
        printArr(arr2);
        //The value are not changr because we copied the address of the original array.
        //This type of copied array is called SHALLOW COPY
    }
}