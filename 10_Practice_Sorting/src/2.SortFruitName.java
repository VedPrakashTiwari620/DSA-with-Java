class SortFruitName {

    static void sortFruitInLexicographical(String arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0){
                    min=j;
                }
            }
            //swap
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = arr[i];

        }
    }

    public static void main(String[] args) {
        // Sort the fruits name

        String[] arr = {"apple", "papaya", "kiwi", "mango"};

        sortFruitInLexicographical(arr);

        for (String string : arr) {
            System.out.print(string + " ");
        }

    }
}
