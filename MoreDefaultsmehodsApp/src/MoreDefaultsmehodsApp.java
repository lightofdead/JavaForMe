interface First{
   default void show(){
       System.out.println("Имя объекта: Интерфейс First");
   };
}
interface Second{
    default void show(){
       System.out.println("Имя объекта: Интерфейс Second");
   };
}

class MyClass implements First,Second{
    String name;
    public void show(){
        First.super.show();
        Second.super.show();
    }
}    
    

/**
 *
 * @author LightOfDead
 */
public class MoreDefaultsmehodsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
