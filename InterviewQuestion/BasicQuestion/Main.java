
// Question-->  Is this code run properly?

// We all have seen NullPointerException when we invoke a method on the object that is NULL. But here this 
// program will work and prints “Test foo called”. When the java code is compiled to produced byte code, it
// figures out that foo() is a static method and should be called using class. So it changes the method call
// obj.foo() to Que2.foo() and hence no NullPointerException.   

public class Main {
    public static String foo() {
        System.out.println("Test foo called");
        return "---";
    }

    public static void main(String args[]) {
        Que2 obj = null;
        System.out.println(obj.foo());
    }

}
