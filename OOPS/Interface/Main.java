
interface Sci {
  void display();
}

interface Math {
  void show();
}

class test implements Math, Sci {
  public void show() {
    System.out.println("Math Interface");
  }

  public void display() {
    System.out.println("Sci Interface");
  }
}


class Main{
  public static void main(String[] args) {
    test t1 = new test();
    t1.show();
    t1.display();

  }
}

