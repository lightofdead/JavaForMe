class MyException extends Exception{
    private int code;
    MyException(int n){
        super();
        code=n;
    }
    public String toString(){
        String txt ="Исключение класса MyException\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="---------------------";
        return txt;
    }
}

class MyMistake extends RuntimeException{
    private int code;
    MyMistake(int n){
        super();
        code=n;
    }
    public String toString(){
        String txt ="Исключение класса MyMistake\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="*********************";
        return txt;
    }
}

/**
 *
 * @author 79535
 */
public class UsingMyExceptionApp {
    static void alpha(int n) throws MyException{
        throw new MyException(n);
    }
    static void bravo(int n){
        throw new MyMistake(n);
    }
    public static void main(String[] args) {
        try{
            try{
                alpha(123);
            }
            catch(MyException e){
             System.out.println(e);
            }
        }
        catch(MyMistake e){
            System.out.println(e);
        }
    }
    
}