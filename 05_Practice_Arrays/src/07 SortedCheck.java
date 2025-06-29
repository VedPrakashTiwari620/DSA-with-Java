class SortedCheck {
    public static boolean sortedOrNot(int arr[]){

        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={0,2,2,3,3,3,4,5};
        boolean sorted = SortedCheck.sortedOrNot(arr);
        if(sorted) System.out.println("The given Array is sorted.");
        else System.out.println("The Given array is not sorted.");
    }
}
