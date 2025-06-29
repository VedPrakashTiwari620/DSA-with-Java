class PrintSubseq {

    static void printSSQ(String s, String currAns){

       if (s.length()==0){
           System.out.println(currAns);
           return;
       }

       char curr = s.charAt(0);
       String remStr = s.substring(1);

       printSSQ(remStr, currAns+curr);
       printSSQ(remStr, currAns);
//
//
//
//        if (s.length()==0){
//            System.out.println(currAns);
//            return;
//        }
//
//        char curr = s.charAt(0);  // a
//
//
//        String remString = s.substring(1);  //bc
//
//
//        // Curr char --> choose to be a part of currAns
//        printSSQ(remString, currAns+curr);  // bc, a
//
//
//        // Curr char --> does not choose to be a part of currAns
//        printSSQ(remString, currAns);
    }

    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
