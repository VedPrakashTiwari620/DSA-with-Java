package RandomQuestion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> numList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    numList.add(arr[j]);
                }
            }
        }
        return numList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        int arr[]=new int[]{1,2,3,4,5};
        numList = (ArrayList<Integer>) findDuplicates(arr);
        System.out.println(numList);
    }
}