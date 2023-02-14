
//Abstraction acheived 

class car extends Vehical{
    int no_of_tyres = 4;
    void start(){
        System.out.print("Start with key");
    }

    public static void main(String[] args) {
        car c = new car();
        System.out.print("Car -> ");
        c.start();
        System.out.print(", Tyres " + c.no_of_tyres);
        
        System.out.println();
 
        bike b = new bike();
        System.out.print("bike -> ");
        b.start();
        System.out.print(", Tyres " + b.no_of_tyres);
        
    }
}

class bike extends Vehical{
    int no_of_tyres = 2;
    void start(){
        System.out.print("Start with self");
    }
}

abstract class Vehical {
    int no_of_tyres ;
    abstract void start();
   
}

