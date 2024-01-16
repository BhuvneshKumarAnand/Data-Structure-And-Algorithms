// import java.util.Scanner;

public class Hanoi {
    public static void towerHanoi(int n, char s, char h, char d) {
        if (n == 1) {
            System.out.println(s + " " + d);
            return;
        }
        towerHanoi(n - 1, s, d, h);
        System.out.println(s + " " + d);
        towerHanoi(n - 1, h, s, d);
    }

    public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        towerHanoi(3, 'a', 'b', 'c');
    }
}
