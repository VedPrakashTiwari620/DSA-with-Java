class SumOfNWithAlterSign {

    static int sumSeries(int n){
        if (n==0) return 0;
        if(n%2==0) return sumSeries(n-1)-n;
        return sumSeries(n-1)+n;
    }

    public static void main(String[] args) {
        //Given a num n. Find th sum of natural numbers till n but with alternate signs.
        //n=10, 1-2+3-4+5-6+7-8+9-10=-5

        System.out.println(sumSeries(5));


    }
}
