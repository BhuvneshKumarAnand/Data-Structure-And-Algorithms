package InnerClass;

 class A {
    public void show(){
        System.out.println("In Show...");
    }

    class B {
        public void config(){
            System.out.println("In Config...");
        }
    }

    static class C {
        public void show(){
            System.out.println("In C...");
        }
    }
}
