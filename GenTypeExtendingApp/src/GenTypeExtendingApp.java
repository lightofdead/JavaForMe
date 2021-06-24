class Base{
    String name;
    Base(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("Имя объекта: "+name);
    }
}

class Alpha extends Base{
    int number;
    public Alpha(String name, int number) {
        super(name);
        this.number=number;
    }
    public void show(){
        super.show();
        System.out.println("Число: "+number);
    }
}

class Bravo extends Alpha{
    char symbol;
    public Bravo(String name, int number, char s){
        super(name,number);
        symbol=s;
    }
    public void show(){
        super.show();
        System.out.println("Символ: "+symbol);
    }   
}

class MyClass<X extends Base>{
    X obj;
    MyClass( X obj){
        this.obj=obj;
    }
    void show(){
        System.out.println("Обхект класса MyClass: ");
        obj.show();
    }
}

/**
 *
 * @author LightOfDead
 */
public class GenTypeExtendingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass Alpha = new MyClass<>(new Alpha("Alpha",123));
        MyClass Bravo = new MyClass<>(new Bravo("Bravo",321,'S'));
        Alpha.show();
        Bravo.show();
    }
    
}
