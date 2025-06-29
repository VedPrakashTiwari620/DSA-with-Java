class NoOfOccurences {

    public static int noOfOccur(int arr[], int key){
        int count=0;

        for (int i=0;i< arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count the number of occurrences of a particular element x.");
        int arr1[]={1,2,3,4,2,1,3,2,3,4,3,4,3};
        int key=3;
        int count=NoOfOccurences.noOfOccur(arr1,key);
        System.out.println("No of element "+key+" in the array "+count);

    }
}
