package InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        // obj.show();

        A.B newObj = obj.new B(); // instantiate with the object of parent class
        // newObj.config();

        A.C obj1 = new A.C(); // static inner class can be instantiated without the object of parent class
        // obj1.show();

        // Anonymous Inner Class
        A obj2 = new A(){
            @Override
            public void show(){
                System.out.println("In show 2...");
            }
        };
        obj2.show();

        // Anonymous Inner Class With Abstract Class
        B obj3 = new B(){
            @Override
            public void show(){
                System.out.println("In show 3...");
            }
        };
        obj3.show();
    }
}