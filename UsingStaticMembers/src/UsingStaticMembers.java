/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class MyClass{
    static int count = 0;
    MyClass(){
        count++;
        System.out.println("Создат объёкт: "+count);        
    }
    static void show(){
        System.out.println("Количество созданных объектов: "+count);
    }
}

/**
 *
 * @author LightOfDead
 */
public class UsingStaticMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass obj4 = new MyClass();
        MyClass obj5 = new MyClass();
        MyClass.show();
        
    }
    
}
