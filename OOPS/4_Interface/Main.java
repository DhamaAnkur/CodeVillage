
//Interface :- It is a blueprint of class , it is used to acheive 100% abstraction and multiple inheritance

interface Sci {
  void display(int a , int b);
}

interface Math {
  void show(int a, int b);
}

class test implements Math, Sci {
  public void show(int a , int b) {
    System.out.println("Math Interface--> " + (a+b) );
  }

  public void display(int a , int b) {
    System.out.println("Sci Interface--> " + (a-b) );
  }

}


class Main{
  public static void main(String[] args) {
    test t1 = new test();
    t1.show(2,4);
    t1.display(2,4);

  }
}

