public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to two pointer approach in array.");

        //Reverse an array element
        int arr[]=new int[]{1,2,3,4,5};

        int i=0;
        int j=arr.length-1;
        int temp;

        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}