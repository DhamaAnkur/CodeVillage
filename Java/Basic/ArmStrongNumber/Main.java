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
      int oriNumber = num ;
      int count = 0;
      int sum = 0;

      while(oriNumber!=0){
        oriNumber /= 10;
        count++;
      }

      oriNumber = num ;

      while(oriNumber != 0){
        int rem =  oriNumber%10 ;
        sum += Math.pow(rem, count);
        oriNumber /= 10 ;
      }

      if(sum == num){
        return true;
      }

        return false;
      
    }


}