class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Дочерний поток: "+i);
            try{
                Thread.sleep(4500);
            }catch(InterruptedException e){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}

/**
 *
 * @author 79535
 */
public class ExtendingThreadApp {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Запускается выполнение программы");
        MyThread t = new MyThread();
        System.out.println("Запускается дочерний поток");
        t.start();
        for(int i=0;i<=5;i++){
            System.out.println("Главный поток: "+i);
            Thread.sleep(2000);        
        }
        if(t.isAlive()){
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}
