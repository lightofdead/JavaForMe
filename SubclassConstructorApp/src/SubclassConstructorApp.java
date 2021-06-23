class Alpha{
    String name;
    int code;
    Alpha(String name,int code){
        this.name=name;
        this.code=code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name - "+this.name);
        System.out.println("Поле code - "+this.code);
    }
    Alpha(String name){
        this(name,0);
    }
    Alpha(int code){
        this("Белый",code);
    }
    Alpha(){
        this("Желтый,1");
    }    
}
class Bravo extends Alpha{
    char symbol;
    private void show(){
        System.out.println("Класс браво:");
        System.out.println("Поле symbol-"+this.symbol);
        for(int i =1;i<=18;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    Bravo(String name,int code,char symbol){
        super(name,code);
        this.symbol=symbol;
        show();
    }
    Bravo(char symbol){
        super();
        this.symbol=symbol;
        show();
    }
    Bravo(String name){
        super(name);
        this.symbol='A';
        show();
    }
    Bravo(int code){
        super(code);
        this.symbol='B';
        show();
    }
    Bravo(){
        this.symbol='C';
        show();
    }
    Bravo(String name, int code){
        this(name,code,'D');
    }
}

/**
 *
 * @author LightOfDead
 */
public class SubclassConstructorApp {

 
    public static void main(String[] args) {
        Bravo obj;
        obj =new Bravo();
        obj =new Bravo("Красный");
        obj =new Bravo(100);
        obj =new Bravo("Зеленый");
        obj =new Bravo("Зеленый",200);
        obj =new Bravo('Y');
        obj =new Bravo("Синий", 300, 'Z');
    }
    
}
