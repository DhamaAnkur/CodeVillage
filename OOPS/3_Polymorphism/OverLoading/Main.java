// package OOPS.OverLoading;

// Over Loading
class A {
    void show(Object a) {
        System.out.println("From method show1");
    }

    void show(int n) {
        System.out.println("From method show2");
    }

    void show(int n, String a) {
        System.out.println("From method show3");
    }

}

public class Main {

    public static void main(String[] args) {
        A input = new A();
        // int [] arr  = new int[10];
        input.show(input);  // it calls method 1-->show(object) because input is the object..
        //input.show(arr) --> it calls method 1-->show(object) because object is the parent of all class 
        //input.s('a');    automatic promote to integer and call-->show(int)
    }

}
