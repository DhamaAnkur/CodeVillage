// The code won’t compile because we can’t have an Object class method with the static keyword. Note that
// the Object class has toString() method. You will get a compile-time error as “This static method cannot
// hide the instance method from Object”. The reason is that the static method belongs to the class and since
// every class base is an Object, we can’t have the same method in the instance as well as in class. get
// this error if you change the method name from toString() to something else that is not You won’t present
// in the superclass Object.

// package InterviewQuestion;

import java.util.*;


public class Main1 {
    
    public static String toString(){
		System.out.println("Test toString called");
		return ".";
	}
	
	public static void main(String args[]){
		System.out.println(toString());
	}

}
