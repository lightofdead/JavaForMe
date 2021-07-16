import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author 79535
 */
public class DaemonThreadApp {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            int k=1, s=0;
            while(true){
                System.out.println(Thread.currentThread().getName()+": "+ s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            s+=k;
            k++;
            }
            
            
        }, "Вычисление суммы");
        t.setDaemon(true);
        t.start();
        int res;
        do{
            res=showConfirmDialog(null,"Закончить вычисление суммы",
                    "сумма чисел", YES_NO_OPTION);
        }while(res!=YES_OPTION);
    }
    
}
