import java.util.Arrays;

class CountElement {

    public static int noOfGreater(int arr[], int key){
        int ind=-1;
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            if(arr[i]>key){
                ind=i;
                break;
            }
        }
        return arr.length-ind;
    }
    public static int noOfGrea(int arr[], int key){
        int count=0;
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            if(arr[i]>key){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Find the last occurrences of element x.");
        int arr1[]={1,2,3,4,5,6,7,8};
        int key=3;
        int count=CountElement.noOfGreater(arr1,key);
        System.out.println("No of Greatest element to "+key+" in the array "+count);
        int count1=CountElement.noOfGrea(arr1,key);
        System.out.println("No of Greatest element to "+key+" in the array "+count1);
    }
}
