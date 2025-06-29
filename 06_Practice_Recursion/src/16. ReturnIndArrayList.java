import java.util.ArrayList;

class ReturnIndArrayList {

    public static ArrayList<Integer> allIndices(int arr[], int tar, int ind){
        ArrayList<Integer> newArrList = new ArrayList<>();

        if (ind >= arr.length){
            return newArrList;
        }


        if (arr[ind] == tar) newArrList.add(ind);

        ArrayList<Integer> smallAns = allIndices(arr,tar,ind+1);

        newArrList.addAll(smallAns);

        return newArrList;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,2,2,5};
        int tar = 2;
        int ind = 0;
        ArrayList<Integer> arrList = allIndices(arr, 2, 0);
        for (Integer i : arrList) {
            System.out.print(i+" ");
        }
    }
}
