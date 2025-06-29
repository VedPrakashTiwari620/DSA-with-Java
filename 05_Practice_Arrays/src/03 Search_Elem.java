class Search_Elem {

    static int searchElement(int arr[], int element){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==element){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,3};
        int x=5;


//        for(int i=0;i< arr.length;i++){
//            if (arr[i]==x){
//                System.out.println("Element Present at index "+i);
//                break;
//            }
//        }


        System.out.println(Search_Elem.searchElement(arr,x));
    }
}

