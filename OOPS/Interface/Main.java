
interface Math{
  void show();
}

interface Sci{
    void display();
}

class test implements Math,Sci{

   public void show(){
        System.out.println("Interface is done");
    }

    public void display(){
        System.out.println("Multiple Inheritance in interface");
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.show();
        t1.display();
      }

}

