package InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B newObj = obj.new B(); // instantiate with the object of parent class
        newObj.config();

        A.C obj1 = new A.C(); // static inner class can be instantiated without the object of parent class
        obj1.show();
    }
}
