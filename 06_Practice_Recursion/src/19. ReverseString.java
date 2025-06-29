class ReverseString {

    public static String reverseString(String s, int ind){
        String ans = "";
        if (ind==s.length()){
            return "";
        }

        ans+=s.charAt(ind);

//        String smallAns = reverseString(s,ind+1);

        return reverseString(s,ind+1) + ans;
    }

    public static void main(String[] args) {
        //WAP to reverse a string using recursion.


        String s= "dcba";

        System.out.println(reverseString(s,0));

    }
}
