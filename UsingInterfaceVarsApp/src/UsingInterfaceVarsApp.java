interface Base{
    void show();
}
class Alpha implements Base{
    String word;
    Alpha(String txt){
        word=txt;
    }
    public void show(){
        System.out.println("Объект Альфа:\n"+"Слово: "+word);
    }
}
class Bravo implements Base{
    int number;
    Bravo(int n){
        number=n;
    }
    public void show(){
        System.out.println("Объект Браво:\n"+"Число: "+number);
    }
}

public class UsingInterfaceVarsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base ref;
        Alpha A = new Alpha("Word");
        Bravo B = new Bravo(6);
        A.show();
        B.show();
        ref=A;
        ref.show();
        ref=B;
        ref.show();
    }
    
}
