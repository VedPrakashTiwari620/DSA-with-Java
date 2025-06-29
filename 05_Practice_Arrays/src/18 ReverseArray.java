import java.util.Scanner;

class ReverseArray {

    static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    static int[] inputArr(int size){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the "+size+" element of the array");
        int arr[]=new int[size];
        for (int i =0;i<size;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }



    static int[] reverseArr(int arr[]){

        int n=arr.length;
        int arr1[]=new int[n];
        int j=0;
//        for (int i=n-1;i>=0;i--){
//            arr1[j]=arr[i];
//            j++;
//
//        }


        int i=n-1;
        while (i>=0){
            arr1[j++]=arr[i];
            i--;
        }

        return arr1;
    }



    static void revWithoutNewArr(int arr[]){
        int n=arr.length;

        int i=0;
        int j=n-1;
        int temp;
        while (i<n/2){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;


        }
    }



    public static void main(String[] args) {

        //Reverse an array consisting of integer values
        //Reverse an array consisting of integer values without creating an new array


        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size= input.nextInt();

        int arr[]=inputArr(size);

//        int arr1[]=reverseArr(arr);

        revWithoutNewArr(arr);

        print(arr);

    }
}
