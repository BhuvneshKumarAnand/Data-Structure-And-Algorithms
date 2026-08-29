package ThreadPackage;

public class A extends Thread {
    public void run(){
        for(int j=0;j<100;j++){
            System.out.println("A");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
