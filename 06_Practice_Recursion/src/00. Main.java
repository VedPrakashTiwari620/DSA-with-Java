class Main {
    static void fun1(){
        int x=1;
        fun2();
        System.out.println(x);
    }
    static void fun2(){
        int x=2;
        fun3();
        System.out.println(x);
    }
    static void fun3(){
        int x=3;
        fun4();
        System.out.println(x);
    }
    static void fun4(){
        int x=4;
        fun5();
        System.out.println(x);
    }
    static void fun5(){
        int x=5;
        System.out.println(x);
    }
    public static void main(String[] args) {
        fun1();
    }
}