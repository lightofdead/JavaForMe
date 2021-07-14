import static java.lang.System.*;
/**
 *
 * @author 79535
 */
public class UsingCheckedExceptionsApp {
    static void alpha(int n) throws Exception{
        String txt= "Метода alpha() с аргументом: "+n;
        throw new Exception(txt);
    }
    static void bravo(int n){
        String txt= "Метода bravo() с аргументом: "+n;
        try{
            if(n>0){
                throw new Exception(txt);
            }
            else{
                throw new RuntimeException(txt);
            }
        }catch(RuntimeException e){
            throw e;
        }
        catch(Exception e){
        out.println("Обработка ошибки в bravo()");
        out.println(e.getMessage());
        out.println("*************************");
    }
    }
    static void catchMe(Exception e){
        out.println("Обработка ошибки в main():");
        out.println(e.getMessage());
        out.println("-------------------------");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
            alpha(123);
        }
        catch(Exception e){
            catchMe(e);
        }
        try{
            bravo(123);
        }
        catch(Exception e){
            catchMe(e);
        }
        try{
            bravo(-1);
        }
        catch(Exception e){
            catchMe(e);
        }
    }
    
}
