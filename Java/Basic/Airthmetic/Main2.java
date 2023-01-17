
public class Main2{


    public static void main(String[] args) {
        //with using (+ , -)---------------------------------------------------------------
        int a = 2;
        int b = 1;

        System.out.print("A->" + a);
        System.out.print(" B->" + b);

        System.out.println();
        
        // a = a+b ;
        // b = a-b;
        // a = a-b;

        // System.out.print("A->" + a );
        // System.out.print(" B->"+b);

        //with using ( * , /)-----------------------------------------------------

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.print("A->" + a );
        System.out.print(" B->"+b);
     
    }
}