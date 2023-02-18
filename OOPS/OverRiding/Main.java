// // Over Riding
// class A{
//     void show(){
//         System.err.println("1");;
//     } 
// }

// class B extends A{
//     void show(){
//         System.err.println("2");;
//     } 
// }

// class C extends A{
//     void show(){
//         System.err.println("3");;
//     } 
// }

// public class Main {
//     public static void main(String[] args) {
//         C input = new C();
//         input.show(); 
//     }
// }

//----------------------------------------------------------------------------------------------------------------//

//-----It is possoble to have different return type for a override method in child class but child's return 
//type should be sub-type of parent return type .This phenomenon is known as covairant return type.:-

// class abc {
//     Object show(){
//         System.out.println("from abc");
//         return null;
//     }
// }

// class xyz extends abc{
//     String show(){
//         System.out.println("from xyz");
//         return null;
//     }

//     public static void main(String[] args) {
//         abc ab = new abc();
//         ab.show();

//         xyz xy = new xyz();
//         xy.show();
//     }

// }

//---------------------------------------------------------------------------------------------------------------//
//----Access modifier:-

// class abc {
//      void show(){
//         System.out.println("from abc");
       
//     }
// }

// class xyz extends abc{
//     public void show(){
//         System.out.println("from xyz");
        
//     }

//     public static void main(String[] args) {
//         abc ab = new abc();
//         ab.show();

//         xyz xy = new xyz();
//         xy.show();
//     }

// }

//--------------------------------------------------------------------------------------------------------------//
//----Exception handling with overridden:-
// (1)Ist case --> if parent class does throw any exception then child class only throws unchecked exception.

// (2)2nd case --> in this case if child class have throw any exception then parent class must throw parent 
//----------------> exception compared to child exception.

class abc {
    void show() throws RuntimeException{
       System.out.println("from abc");
      
   }
}

class xyz extends abc{
    void show() throws ArithmeticException{
       System.out.println("from xyz");
       
   }

   public static void main(String[] args) {
       abc ab = new abc();
       ab.show();

       xyz xy = new xyz();
       xy.show();
   }

}

