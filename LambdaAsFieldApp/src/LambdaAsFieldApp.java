interface MyInterface{
    int getnumber(int n);
}

class MyClass{
    private MyInterface ref;
    MyClass(MyInterface ref){
        set(ref);
    }
    void set(MyInterface ref){
        this.ref=ref;
    }
    int get(int n){
        return ref.getnumber(n);
    }
}

/**
 *
 * @author 79535
 */
public class LambdaAsFieldApp {
    public static void main(String[] args) {
        MyClass obj=new MyClass((int n)->{return n*n;});
        System.out.println("Аргумент:");
        for(int i=0;i<=5;i++){
            System.out.print(obj.get(i)+"\t");
        }
        System.out.println("");
        obj.set((int n)->{return n*n;});
        System.out.println("Аргумент в квадрате:");
        for(int i=0;i<=5;i++){
            System.out.print(obj.get(i)+"\t");
        }
        obj.set((int n)->{return n*n*n;});
        System.out.println("\nАргументы в кубе:");
        for(int i=0;i<=5;i++){
                 System.out.print(obj.get(i)+"\t");
            }
         System.out.println("");
        }
    }
    

