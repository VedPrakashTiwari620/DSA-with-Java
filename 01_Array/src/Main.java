import java.util.Scanner;

class ArrayExample{

    void demoArrays(){
        int age[]=new int[3];

        age[0]=12;
        age[1]=12;
        age[2]=12;

        System.out.println(age[0]+"\n"+
        age[1]+"\n"+
        age[2]);
    }


    void mulArr(){
//        int arr[][]=new int[3][3];
        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for(int i[]:arr) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    int[][] inputTwoD(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=input.nextInt();

        int arr[][]= new int[size][size];
        System.out.println("Enter the element of the array");

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
        return arr;
    }

    void print(){
        int arr[][]=inputTwoD();

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Intro to Array!");
        ArrayExample obj = new ArrayExample();
        obj.demoArrays();

        obj.mulArr();

        obj.print();


    }
}