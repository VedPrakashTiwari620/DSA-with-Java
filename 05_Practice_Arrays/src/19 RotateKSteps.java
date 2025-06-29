import java.util.Scanner;

class RotateKSteps {

    static int[] inputArr(int size){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the "+size+" element of the array");
        int arr[]=new int[size];
        for (int i =0;i<size;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }


    static int[] rotate(int arr[], int k){
        int n= arr.length;
        k=k%n;
        int ans[]=new int[n];

        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }

        return ans;


    }


    public static void main(String[] args) {
        //Rotate the given array 'a' by k steps, where k is non-negative.
        //Note: k can be greater than n as well.

        int size=5;
        int arr[]=inputArr(size);
        int ans[]=rotate(arr,2);
        ReverseArray.print(arr);
        System.out.println();
        ReverseArray.print(ans);



//        int arr5[]=new int[]{
//                1,2,3,4,5,6,7
//        };
//        System.out.println(arr5[4]);
//
//        String names[]={"Abc"
//        };
//        String names1[]=new String[]{
//                "Ram","Shyam","mohan","ram","dhyam"
//        };
    }
}
