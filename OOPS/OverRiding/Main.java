package OOPS.OverRiding;

// Over Riding
class A{
    void s(String a){
        System.err.println("11");;
    } 
}

class B{
    void s(int n){
        System.err.println("Ankur");;
    } 
}

class C{
    void s(int n ,String a){
        System.err.println("Ankur 11");;
    } 
}
public class Main {


    public static void main(String[] args) {
        A input = new A();
        input.s("Annn");
    }

}
