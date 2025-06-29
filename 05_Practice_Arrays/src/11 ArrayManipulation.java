import java.util.Arrays;

class ArrayManipulation {

    public static int uniqueElem(int arr[]){

        for (int i =0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }


        int ind=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                ind=i;
            }
        }
        return ind;
    }



    public static void main(String[] args) {
        System.out.println("Find the unique number in a given Array where all the elemenrs are being \n" +
                "repeated twice with one value being unique.");

        int arr[]={1,2,3,3,2,1};


        int ind;
        ind=ArrayManipulation.uniqueElem(arr);
        if(ind<0){
            System.out.println("The unique element is not found the array");
        }else {
            System.out.println("The unique element is found at index "+ind+" and element is "+arr[ind]);
        }





    }
}
