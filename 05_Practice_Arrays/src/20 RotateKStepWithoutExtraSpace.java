import java.util.Scanner;

class RotateKStepWithoutExtraSpace {

    static void reverse(int arr[], int i, int j){
        int temp;
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotateKSteps(int arr[],int k){
        int n = arr.length;
        k=k%n;


        reverse(arr,0,n-k-1);
        reverse(arr,n-k, n-1);
        reverse(arr,0,n-1);


        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=input.nextInt();
        int arr[]=RotateKSteps.inputArr(size);
        System.out.println("Enter how many times to ratate:");
        int k=input.nextInt();


        rotateKSteps(arr,k);

    }
}
