class MyClass{
    int number;
    MyClass next;
}

/**
 *
 * @author LightOfDead
 */
public class ListOfObjectsApp {
    static MyClass createList(int n){
        MyClass obj = new MyClass();
        obj.number = 1;
        MyClass t = obj;
        for(int i=1;i<=n;i++){
            t.next = new MyClass();
            t.next.number=t.number*(n-i+1)/i;
            t = t.next;
        }
        t.next=null;
        return obj;
    }
    
    static void listShow(MyClass obj){
        String txt ="| ";
        MyClass t =obj;
        do{
            txt+=t.number+"| ";
            t=t.next;
        }while(t!=null);
        System.out.println(txt);
    }
    public static void main(String[] args) {
        MyClass A = createList(5);
        MyClass B = createList(10);
        listShow(A);
        listShow(B);
    }
    
}
