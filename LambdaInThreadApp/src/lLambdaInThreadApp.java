import static java.lang.System.*;

/**
 *
 * @author 79535
 */
public class lLambdaInThreadApp {

    
    public static void main(String[] args) throws InterruptedException {
        out.println("Начинается выполнение программы");
        Runnable r=()->{
            for(int i=1;i<=5;i++){
                out.println("Дочерний поток:\t"+i);
                try{
                    Thread.sleep(4500);
                }catch(InterruptedException e){
                    out.println("Прерывание дочернего потока");
                }
            }
        };
        Thread t = new Thread(r);
        out.println("Запускается дочерний поток");
        t.start();
        for(int i=0;i<=5;i++){
            out.println("Главный поток: "+i);
            Thread.sleep(2000);
            }
        if(t.isAlive()){
            t.join();
        }
        out.println("Выполнение программы завершено");
        }
    }

