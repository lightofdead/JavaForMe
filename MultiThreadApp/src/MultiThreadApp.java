import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread extends Thread{
    private int count;
    MyThread(String name, int count){
        super(name);
        this.count=count;
        start();
    }
    
    public void run(){
        System.out.println("Выполняется поток"+getName());
        Random rnd = new Random();
        for(int i=0;i<=5;i++){
            System.out.println("Сообщение от потока "+getName()+":\t"+
                    getName().charAt(0)+i);
            try {
                Thread.sleep(1000+rnd.nextInt(2001));
            } catch (InterruptedException e) {
                System.out.println("Прерывание потока"+getName());
            }
        }
        System.out.println("Поток "+getName()+" Завершен");
    }
}

/**
 *
 * @author 79535
 */
public class MultiThreadApp {

    public static void main(String[] args) throws InterruptedException {
        MyThread A = new MyThread("ALPHA", 5);
        MyThread B = new MyThread("BETA", 3);
        MyThread C = new MyThread("CHARLIE", 7);
        for(int i=1;i<=4;i++){
             System.out.println("Message from main thread "+i);
             Thread.sleep(2000);
        }
        if(A.isAlive()){
            A.join();
        }
        if(B.isAlive()){
            B.join();
        }
        if(C.isAlive()){
            C.join();
        }
        System.out.println("Главный поток завершен");
    }
    
}
