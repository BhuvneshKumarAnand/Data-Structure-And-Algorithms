package InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B newObj = obj.new B();
        newObj.config();
    }
}
