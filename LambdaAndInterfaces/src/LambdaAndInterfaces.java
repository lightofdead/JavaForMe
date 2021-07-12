interface Alpha{
   public void showA();
}
interface Bravo{
    void showB();
}
interface Charlie{
    void showC();
}


/**
 *
 * @author 79535
 */
public class LambdaAndInterfaces {

    public static void main(String[] args) {
       Alpha A =()->System.out.println("Используем лямбда-выражение");
       A.showA();
       Bravo B =()->System.out.println("Используем лямбда-выражение");
       B.showB();
       Charlie C=A::showA;
       C.showC();
    }
    
}
