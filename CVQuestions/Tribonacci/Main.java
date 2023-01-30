// package Tribonacci;

public class Main {
    
    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        int c= 2;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        for(int i=0; i<10; i++){
            int z = a+b+c;
            System.out.println(z);
            a=b;
            b=c;
            c=z;

        }

    }
}
