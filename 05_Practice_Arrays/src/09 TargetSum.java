class TargetSum {

    public static int countPairs(int arr[], int target){
        int count=0;
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Find the total number of pairs in the Array" +
                "" +
                " \n whose sum is equal to the given value x.");
        int arr[]={1,2,3,4,1,2};
        int target=4;
        int count=TargetSum.countPairs(arr,target);


        System.out.println("The total pairs whose sum is equal to the given value is "+count);
    }
}
