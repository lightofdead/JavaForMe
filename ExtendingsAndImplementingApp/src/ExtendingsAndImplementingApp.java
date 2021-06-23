interface First{
    String getFirst();
    default void show(){
        System.out.println("Интерфейс First: метод show()");
    }
}
interface Second{
    String getSecond();
    default void show(){
        System.out.println("Интерфейс Second: метод show()");
    }
}
class Base{
    String getBase(){
        return "класс base";
    }
    void show(){
        System.out.println("класс Base: метод show()");
    }
}
class MyClass extends Base implements First, Second{
    public String getFirst(){
        return "Интерфейс First";
    }
    public String getSecond(){
        return "Интерфейс Second";
    }
    public void show(){
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show();
        Second.super.show();
        super.show();
    }
    
}



public class ExtendingsAndImplementingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
    
}
