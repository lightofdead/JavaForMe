import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

/**
 *
 * @author 79535
 */
public class TryCatchApp {

    
    public static void main(String[] args) {
        String input;
        int num;
        input=showInputDialog(null, "Введите число", "Число", QUESTION_MESSAGE);
        if(input==null){
            System.exit(0);
        }
        try{
            num=parseInt(input);
            showMessageDialog(null, "числа "+(num-1)+", "+num+" и "+(num+1), "Числа", INFORMATION_MESSAGE);
        }catch(Exception e){
            showMessageDialog(null, "Что-то пошло не так", "Ошибка", ERROR_MESSAGE);
        }
    }
    
}
