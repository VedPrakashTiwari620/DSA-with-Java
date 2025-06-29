class RemoveOccurencesString {

    static String removeOccur(String s, int ind){
        String ans = "";
        if (ind==s.length()){
            return ans;
        }
        if (s.charAt(ind)!='a'){
            ans+=s.charAt(ind);
        }

        String smallAns = removeOccur(s, ind+1);

        return ans+smallAns;
    }



    static String removeOccurrenceA(String s){
        String ans = "";
        if (s.length()==0){
            return " ";
        }
        String smallAns = removeOccurrenceA(s.substring(1));
        char currChar = s.charAt(0);
        if (currChar != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        //Remove all the occurrences of 'a' from string s="abcax"

        String s = "abcaxasdfaasfda";
        String ans ="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='a'){
                ans+= s.charAt(i);
            }
        }
        System.out.println(ans);


        System.out.println(removeOccur(s,0));
        System.out.println(removeOccurrenceA(s));
    }
}
