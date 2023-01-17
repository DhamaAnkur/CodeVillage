// package OOPS.OverLoading;

// Over Loading
class A {
    void s(String a) {
        System.out.println("11");

    }

    void s(int n) {
        System.out.println("Ankur");

    }

    void s(int n, String a) {
        System.out.println("Ankur 11");
    }

}

public class Main {

    public static void main(String[] args) {
        A input = new A();
        input.s(11);
    }

}
