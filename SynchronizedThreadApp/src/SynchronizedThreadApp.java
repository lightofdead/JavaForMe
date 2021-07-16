import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyNumber{
    int number;
    MyNumber(int n){
        number=n;
    }
}
class MyThread extends Thread{
    MyNumber obj;
    int count;
    int time;
    boolean state;
    MyThread(String name ,MyNumber obj, int time, int count, boolean state){
        super(name);
        this.obj=obj;
        this.time=time;
        this.count=count;
        this.state=state;
        start();
    }
    private void line(){
        char s;
        if(state) s='-';
        else s='*';
        for(int i=0;i<=34;i++){
            System.out.print(s);
        }
        System.out.println("");
    }
    public void run(){
        synchronized(obj){
            for(int i=0;i<=count;i++){
                line();
                System.out.println("Поток "+getName()+", Исходное значение: "
                +obj.number);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException ex) {
                   System.out.println(ex);
                }
                if(state) obj.number++;
                else obj.number--;
                System.out.println("Поток "+getName()+", Новое значение: "
                +obj.number);
                line();
            }
        }
    }
}

/**
 *
 * @author 79535
 */
public class SynchronizedThreadApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), count=in.nextInt(), time=100, dt=200;
        MyNumber obj = new MyNumber(n);
        MyThread Alpha=new MyThread("Alpha",obj,time+dt,count,true);
        MyThread Bravo=new MyThread("Bravo",obj,time+dt,count,false);
        if(Alpha.isAlive()){
            Alpha.join();
        }
        if(Bravo.isAlive()){
            Bravo.join();
        }
    }  
}
