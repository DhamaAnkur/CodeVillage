import java.lang.reflect.Constructor;

// package OOPS.Constructor;
// How to use Constructor

// import java.util.Scanner;
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
//         // e1.i = 5;
//         // e1.name = "Ankur";
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

// class Employee{
//     String name ;
//     int age ;
//     int contact;
//      Employee(String name , int age ){
//         this.name = name ;
//         this.age = age;
//         // System.out.println("Parameterized constructor");
//     }

//     Employee(String name  , int age  , int contact){
//         this.name = name ;
//         this.age = age;
//         this.contact = contact;
//     }

//     void show(){
//         System.out.print(name + ", ");
//         System.out.print(age +", ");

//         if(contact !=0){
//         System.out.print(contact);
//         }

//         System.out.println();

//     }

// public static void main(String[] args) {
//    Employee e1 = new Employee("Ankur" , 30 , 12);
//    Employee e2 = new Employee("Dhama" , 20);
//     e1.show();
//     e2.show();
// }
// }

//--------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Employee {
    String name;
    int age;
    int contact;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        // System.out.println("Parameterized constructor");
    }

    Employee(Constructor Employee, int contact) {
        this.contact = contact;
    }

    void show() {
        System.out.print(name + ", ");
        System.out.print(age + ", ");

        if (contact != 0) {
            System.out.print(contact);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Employee e1 = new Employee("Ankur" , 30 , 12);
        Employee e2 = new Employee("Dhama", 20);
        // e1.show();
        e2.show();
    }
}
