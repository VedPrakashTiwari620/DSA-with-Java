class GCDusingLongDivMethod {

    static int longDivMethod(int x, int y){
        while (x%y!=0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    static int gcd(int x, int y){
        if (y==0) return x;

        return gcd(y,x%y);
    }


    public static void main(String[] args) {
        //Given two numbers x and y. Find the GCD of x and y.
        System.out.println("Find GCD using Long Division method.");

        System.out.println(longDivMethod(30,15));

        System.out.println(gcd(30,15));
    }
}
