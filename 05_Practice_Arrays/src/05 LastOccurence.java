class LastOccurence {
    public static int lastOccur(int arr[], int key){
        int ind=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==key) {
                ind=i;
            }
        }

        return ind;
    }

    public static void main(String[] args) {
        System.out.println("Find the last occurrences of element x.");
        int arr1[]={1,2,3,4,2,1,3,2,3,4,3,4,3};
        int key=3;
        int ind=LastOccurence.lastOccur(arr1,key);
        System.out.println("Last occurence of element "+key+" is at index "+ind);
    }
}
