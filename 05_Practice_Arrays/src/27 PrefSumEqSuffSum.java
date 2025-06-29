import java.util.Scanner;

class PrefSumEqSuffSum {

//    static void makePrefixSum(int arr[]){
//        for (int i = 1; i < arr.length; i++) {
//            arr[i]+=arr[i-1];
//        }
//    }


    static int findTotalSum(int arr[]){
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
        }
        return totalSum;
    }


    static boolean equalSumPartition(int arr[]){
       int totalSum=findTotalSum(arr);

       int prefSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefSum+=arr[i];
            int suffixSum= totalSum-prefSum;

            if (prefSum==suffixSum){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= input.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        System.out.println("Possible equal partition: "+ (equalSumPartition(arr)?"True":"False"));
    }
}
