package ThreadPackage;

public class B extends Thread {
    public void run(){
        for(int j=0;j<100;j++){
            System.out.println("B");
        }
    }
}
