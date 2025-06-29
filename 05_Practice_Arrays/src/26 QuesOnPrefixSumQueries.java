import java.util.Scanner;

class QuesOnPrefixSumQueries {


    static int[] makePrefixArray(int arr[]){

        for (int i=1;i< arr.length;i++){
            arr[i]+=arr[i-1];
        }


        return arr;
    }

    public static void main(String[] args) {
        /*
        Given an array of integer of size n.
        Answer q Queries  where you need to print the sum
        of values in a given range of indices from l to r(both included.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= input.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter the element: ");
        for (int i = 1; i <= size; i++) {
            arr[i]=input.nextInt();
        }

        int pref[]= makePrefixArray(arr);

        System.out.println("Emter number of queries: ");
        int q=input.nextInt();

        while (q-- >0){
            System.out.println("Enter range ");
            int l=input.nextInt();
            int r=input.nextInt();

            int ans=pref[r]-pref[l-1];
            System.out.println("Sum "+ans);
        }

    }
}
