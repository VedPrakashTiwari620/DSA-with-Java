class SumOfN {

    static int sumN(int n){
        if(n==1){
            return 1;
        }
        return sumN(n-1)+n;
    }

    public static void main(String[] args) {
        //Sum of n Natural  number
        System.out.println(sumN(4));
    }
}
