package oopsBasics.interfaceLearn;

public class C implements A,B {
    public static void main(String[] args) {
        // C.show(); // Not gonna work
        A.show();
        B.show();
    }
}
