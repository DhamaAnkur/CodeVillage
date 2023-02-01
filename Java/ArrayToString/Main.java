// package ArrayToString;

public class Main {
    
    public static void main(String[] args) {
        char[] arr = {'A','N', 'K', 'U', 'R'};

        String ans  = "";
        for(int i=0; i<arr.length; i++){
          ans += arr[i];
        }

        System.out.println(ans);

        // for(int i=0; i<ans.length(); i++){
        //     System.out.println(ans.charAt(i));
        // }

    }
}
