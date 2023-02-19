// package OOPS.Constructor;
// How to use Constructor

import java.util.Scanner;
// class Employee {
//     String name ;
//     int age ;
//     Employee(String name ,int age){
//         this.name  = name;
//         this.age = age;
//     }

//     void show(){
//         System.out.println("Name-->" + name);
//         System.out.println("Age-->" + age);
//         System.out.println("-----------------------------------------------");
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         // String name = scn.nextLine();
//         // int age = scn.nextInt();
//         Employee e1 = new Employee("Will", 25);
//         Employee e2 = new Employee("Smith" , 30);
//         e1.show();
//         e2.show();
//     }

// }


//----------------------------------------------------------------------------------------------------------------//
//Default constructor:-

// class Employee{

//     int i ;     // when the compiler compile the code then a default constructor is made , beacuse class have not
//     String name ;  // even a one constructor
 
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         System.out.println(e1.i+ " , " + e1.name);
//     }
// }


//----------------------------------------------------------------------------------------------------------------//
// No argument constructor

// class Employee{

//      Employee(){
//         System.out.println("No argument constructor");
//      }

//  public static void main(String[] args) {
//     Employee e1 = new Employee();
//  }
// }


//---------------------------------------------------------------------------------------------------------------//
// Parameterized constructor

class Employee{
    String name ;
    int age ;
     Employee(String name , int age ){
        this.name = name ;
        this.age = age;
        // System.out.println("Parameterized constructor");
    }

public static void main(String[] args) {
   Employee e1 = new Employee("Ankur" , 30);
   Employee e2 = new Employee("Dhama" , 20);
   System.out.println(e1.name +  " " + e1.age);
   System.out.println(e2.name +  " " + e2.age);
}
}