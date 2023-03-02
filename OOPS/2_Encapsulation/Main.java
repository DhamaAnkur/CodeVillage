// package OOPS.Encapsulation;

//Encapsulation:- Wrappping different type of data or method in a single unit.

// class Student{
//     private String name ;

//     public void SetName(String name){  //Setter:- it is set the value and firstly we set the the value and then get
//         this.name  = name;
//     }

//     public String GetName(){  //Getter:- It is used to get the value 
//         return name;
//     }
// }

public class Main {
    
    public static void main(String[] args) {
        // Student S = new Student();
        // S.SetName("Ankur");
        // System.out.println(S.GetName());

        int[]arr = new int[2];
        for(int i=0 ; i<=arr.length ; i++){
            arr[i] = 1; 
            System.out.println(i);
        }

    }
}
