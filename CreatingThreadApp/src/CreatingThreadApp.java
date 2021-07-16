import static java.lang.System.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread implements Runnable{
    public void run() {
       for(int i =0;i<=5;i++){
           out.println("Дочерний поток: "+
                   Thread.currentThread().getName().charAt(0)+" "+i);
           try {
               Thread.sleep(2000);
           } catch (InterruptedException ex) {
               out.println("Прерывание выполнения дочернего потока");
           }
       }
    }
    
}

/**
 *
 * @author 79535
 */
public class CreatingThreadApp {

    public static void main(String[] args) throws InterruptedException {
        Thread T = new Thread(new MyThread());
        out.println("Запуск дочернего потока");
        T.start();
        out.println("Запуск главного потока");
        for(int i=0;i<=4;i++){
            out.println("Главный поток: "+
                   Thread.currentThread().getName().charAt(0)+" "+i);
            Thread.sleep(3000);
        }
        if(T.isAlive()){
            T.join();
        }
    }
}
