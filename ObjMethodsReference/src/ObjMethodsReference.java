class MyClass{
    private int number;
    MyClass(int n){
        number =n;
    }
    void set(int n){
        number = n;
    }
    int get(){
        return number;
    }
}

interface MyGetter{
    int myget();
}
interface MySetter{
    void myset(int n);
}

/**
 *
 * @author 79535
 */
public class ObjMethodsReference {

    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println("Создан новы объект с полем "+obj.get());
        MyGetter A=obj::get;
        MySetter B=obj::set;
        System.out.println("Переменная A: "+A.myget());
        System.out.println("Значение поля из объекта obj: "+obj.get());
        obj.set(100);
        System.out.println("Значение поля из объекта obj: "+obj.get());
        System.out.println("Переменная А: "+A.myget());
        B.myset(200);
        System.out.println("Выполнена команда B.myset(200)");
        System.out.println("Переменная A: "
                +A.myget());
        System.out.println("Значение поля из объекта obj: "+obj.get());
        obj = new MyClass(300);
        System.out.println("Создан объект с полем: "+obj.get());
        System.out.println("Переменная A: "+A.myget());
        System.out.println("Значение поля из объекта: "+obj.get());
        B.myset(400);
        System.out.println("Выполнена команда B.myset(400)");
        System.out.println("Переменная A: "+A.myget());
        System.out.println("Значение поля из объекта: "+obj.get());
    }
    
}
