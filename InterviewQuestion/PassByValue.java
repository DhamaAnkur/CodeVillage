// In this we pass refernce of integer number from class PassByValue by it called always pass by value because 
// in java their is no pass by reference

public class PassByValue {

    int number;

    public static void square(PassByValue obj) {
        System.out.println(obj.number);
        obj.number = 10;
        System.out.println(obj.number);
    }


    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        obj.number = 5;
        square(obj);
        System.out.println(obj.number);
    }

}
