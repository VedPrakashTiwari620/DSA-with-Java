class LastRepeated {

    public static int repeatEle(int arr[]){
        int repeat=-1;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    repeat=arr[i];
                }
            }
        }
        if (repeat>-1)return repeat;


        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,4,6};

        int repeatEle=LastRepeated.repeatEle(arr);
        if(repeatEle==-1){
            System.out.println("The repeated element is not found in the array.");
        }else {
            System.out.println("The repeated element is "+repeatEle);

        }
    }
}
