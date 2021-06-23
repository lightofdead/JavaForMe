import java.util.Scanner;
class Alpha{
    private int code;
    public void set(int code){
        this.code = code;
    }
    public void show(){
        System.out.println("Поле code: "+code);
    }
    Alpha(int code){
        set(code);
    }
}
class Bravo extends Alpha{
    Bravo(int code){
        super(code);
    }
}

public class UsingPrivateApp {

   
    public static void main(String[] args) {
       int num; 
       Scanner input = new Scanner(System.in);
       num=input.nextInt();
       Bravo obj=new Bravo(num);
       num=input.nextInt();
       obj.set(num);
       obj.show();
       obj.show();
    }
    
}
