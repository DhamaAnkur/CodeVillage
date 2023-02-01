
// package DecimalToBinary;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int decimal = scn.nextInt();
        int idx = 0;
        int []arr = new int[20];

        if(decimal == 0){
            System.out.println(0);
            return;
        }

        else{
            while(decimal > 0){
                arr[idx++] = decimal%2;
                decimal = decimal/2;
            }

            for(int i=idx-1; i>=0;  i--){
                System.out.print(arr[i]);
            }
        }

    }

}
