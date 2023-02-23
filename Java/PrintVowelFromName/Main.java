// package Java.PrintVowelFromName;

public class Main {
    
    public static void main(String[] args) {
        String name  = "ankur dhama";

        char []arr = {'a','e','i','o','u'};
        int j = 0 ;
    
        System.out.print("Vowels--> ");
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);

            while(j<arr.length){
                if(ch == arr[j]){
                    System.out.print( ch + ",");
                }
                j++;
            }
            j=0;
        }
        
    }
}
