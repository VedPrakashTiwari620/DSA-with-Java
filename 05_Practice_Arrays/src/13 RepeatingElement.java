class RepeatingElement {

    public static int repeatEle(int arr[]){

       for (int i=0;i<arr.length;i++){
           for (int j=i+1;j< arr.length;j++){
               if (arr[i]==arr[j]){
                   return arr[i];
               }
           }
       }

       return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,4};

        int repeatEle=RepeatingElement.repeatEle(arr);
        if(repeatEle==-1){
            System.out.println("The repeated element is not found in the array.");
        }else {
            System.out.println("The repeated element is "+repeatEle);

        }

    }
}
