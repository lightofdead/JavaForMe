class MyClass{
    private int count = 0;
    private int number;
    private String name;
    
    MyClass(String n){
        
        count++;
        number = count;
        name = n;
        System.out.println("Объект "+name+" создан. Его номер: "+number);
    }
    public void show(){
        System.out.println("Номер объекта:"+number);
        System.out.println("Имя объекта:"+name);
        System.out.println("Всего объектов:"+count);       
    }
    public void set(String n){
        String pastName = name;
        name = n;
        System.out.println("Внимание!Имя объекта изменено"
                + "\n было: "+pastName+"\nстало: "+name);
    }
}

/**
 *
 * @author LightOfDead
 */
public class UsingPrivateMembersApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Valorant");
        MyClass obj2 = new MyClass("defender");
        MyClass obj3 = new MyClass("Colgate");
        obj2.show();
        obj2.set("NoDefender");
    }
    
}
