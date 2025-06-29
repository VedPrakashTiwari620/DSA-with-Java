class ReaturnAnSortedArrSquare {

    static int[] sortArrayInSquare(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int ans[]= new int[n];
        int k=0;

        while (i<=j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i]*arr[i];
                i++;
            } else {
                ans[k++] = arr[j]*arr[j];
                j--;
            }


        }

        i=0;
        j=n-1;
        int temp;

        while (i<j){
            temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
        return ans;
    }


    public static void main(String[] args) {
        //Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
        int arr[] = new int[]{-10,-3,-2,2,4,5};
        int ans[]=sortArrayInSquare(arr);
        PrintArrayElement.print1DArr(ans);
    }
}