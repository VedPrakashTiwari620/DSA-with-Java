import java.nio.charset.MalformedInputException;

class FrogProblem1 {

    static int returnMinCost(int h[], int n, int idx ){

        if (idx  == n-1 ) return 0;
        int op1 = Math.abs(h[idx] - h[idx+1]) + returnMinCost(h,n,idx+1);

        if ( idx == n-2 ) return op1;
        int op2 = Math.abs(h[idx] - h[idx+2]) + returnMinCost(h,n,idx+2);


        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        int h[] ={10,30,40,20};


        System.out.println(returnMinCost(h,h.length,0));
    }
}
