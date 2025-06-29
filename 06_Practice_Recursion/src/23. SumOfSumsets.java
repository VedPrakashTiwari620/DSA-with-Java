class SumOfSubsets {

    static void subsetSum(int[] a, int n, int idx, int sum){
        if (idx >= n){
            System.out.println(sum);
            return;
        }

        // curr idx + curr ans
        subsetSum(a,n,idx+1,sum+a[idx]);  //include

        // curr ans
        subsetSum(a,n,idx+1,sum);
    }

    public static void main(String[] args) {
        //Given an array of integers, print sums of all subsets in it. Outputs sum can be in any order.
        int a[] = {2,4,5};

        subsetSum(a,3,0,0);


    }
}
