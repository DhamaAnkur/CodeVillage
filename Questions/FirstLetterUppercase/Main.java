// package FirstLetterUppercase;

public class Main {

  public static void main(String[] args) {
    String str = " my name is ankur dhama ";
    str = str.trim();
    String ans = "";

    for (int i = 0; i < str.length(); i++) {

      if (i == 0) {
        ans += str.charAt(i);
        ans = ans.toUpperCase();
      }
       else {
       ans += str.charAt(i);
      }

    }

    System.out.println(ans);

  }
}
