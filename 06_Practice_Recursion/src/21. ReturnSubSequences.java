import java.util.ArrayList;

class ReturnSubSequences {

    public static ArrayList<String> returnSub(String s){
        ArrayList<String> ans = new ArrayList<>();

        if (s.length()==0) {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallAns = returnSub(s.substring(1));

        for (String ss: smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }

        return ans;
    }


    public static void main(String[] args) {
        String s = "abc";

        ArrayList<String> ans = returnSub(s);
        System.out.println(ans);
    }
}
