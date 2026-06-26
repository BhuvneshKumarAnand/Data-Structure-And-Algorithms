package Abstraction;

public class Test extends AbstractClass{
    void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.sayHello();
    }
}
