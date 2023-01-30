import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class Main{

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the range");
        int a = scn.nextInt();
        int z = scn.nextInt();
     
        for(int i=a ; i<=z ; i++){
         if(IsArmStrong(i)){
          System.out.println("ArmStrong-->" + i);
        }
    }

    }

    public static boolean IsArmStrong(int num){
      int originalNumber = num ;
      int count = 0;
      int sum = 0;

      while(originalNumber!=0){
        originalNumber /= 10;
        count++;
      }

      originalNumber = num ;

      while(originalNumber != 0){
        int rem =  originalNumber%10 ;
        sum += Math.pow(rem, count);
        originalNumber /= 10 ;
      }

      if(sum == num){
        return true;
      }

        return false;

    }


}