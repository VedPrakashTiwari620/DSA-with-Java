import java.util.Scanner;


class QueriesFindNumberPresentOrNot {

    static int[] makeFreqArray(int arr[]){

        int freq[]=new int[10004];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=input.nextInt();
        int arr[]=RotateKSteps.inputArr(size);


        int freq[]=makeFreqArray(arr);
        System.out.println("Enter number of queries : ");
        int q=input.nextInt();



        while (q>0){
            System.out.println("Enter number to be searched ");
            int x=input.nextInt();
            if(freq[x]>0) System.out.println("Present");
            else System.out.println("Not Present");
            q--;
        }
    }
}
