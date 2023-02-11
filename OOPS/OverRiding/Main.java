// package OOPS.OverRiding;

// Over Riding
class A{
    void s(){
        System.err.println("11");;
    } 
}

class B extends A{
    void sr(){
        System.err.println("21");;
    } 
}

class C extends A{
    void src(){
        System.err.println("31");;
    } 
}

public class Main {

    public static void main(String[] args) {
        C input = new C();
        input.s();
        
    }

}
