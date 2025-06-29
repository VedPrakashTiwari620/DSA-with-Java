import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int arr[][][]= new int[2][2][2];

        int arr[][]=new int[2][3];
//        arr[0][0]=1;
//        arr[0][1]=1;
//        arr[0][2]=1;
//        arr[1][0]=1;
//        arr[1][1]=1;
//        arr[1][2]=1;

        int arr2[][]={{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(arr2.length);
        System.out.println(arr.length);

        for (int[] ints : arr) {
            for (int anInt : ints) {

                System.out.print(anInt+" ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        for (int i=0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }


    }
}
