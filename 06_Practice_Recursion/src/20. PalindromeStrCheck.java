class PalindromeStrCheck {

    public static String rev(String s, int ind){

        if (ind == s.length()){
            return "";
        }

        return rev(s,ind+1)+s.charAt(ind);
    }


    public static boolean isPalin(String s, int left, int last){
        if ( left >= last ){
            return true;
        }


        if (s.charAt(left) != s.charAt(last)){
            return false;
        }

        return isPalin(s,left+1,last-1);
    }


    public static void main(String[] args) {
        //WAP to check a given string is palindrome.

        String s = "aaaa";


        if (rev(s,0).equals(s)){
            System.out.println("String is palindrome.");
        }else {
            System.out.println("Not Palindrome.");
        }


        System.out.println(isPalin(s,0,s.length()-1));
    }
}
