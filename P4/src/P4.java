import javax.swing.JOptionPane;

class MyClass{
    int number;
    char symbol;
    //overloading
    MyClass(){
        number=12;
        symbol='f';
    }
    MyClass(int n, char c){
        number = n;
        symbol = c;
    }
    void show(){
       System.out.println("Значения полей: "+number+" и "+symbol);
    }
}

public class P4 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(30, 's');
        System.out.println("Значения obj1: ");
        obj1.show();
        System.out.println("Значения obj2: ");
        obj2.show();

    }
    
}
