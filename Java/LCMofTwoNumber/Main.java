
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = 15;
    int n2 = 35;

    // maximum number between n1 and n2 is stored in lcm
    int lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while (true) {
      if (lcm % n1 == 0 && lcm % n2 == 0) {
        System.out.print(lcm);
        break;
      }

      ++lcm;

    }
  }

}
