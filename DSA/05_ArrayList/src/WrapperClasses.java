public class WrapperClasses {
    public static void main(String[] args) {
        Integer i = 12;
        Integer j = 12;
        Integer k = Integer.valueOf(14);

        System.out.println(i);
        System.out.println(k);

        i=12;
        i=14;

        k=14;
        System.out.println(i);

    }
}