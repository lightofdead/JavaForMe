import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

/**
 *
 * @author 79535
 */
public class MoretryCatchApp {

    
    public static void main(String[] args) {
        String input;
        char[] symbs;
        int size, index;
        input=showInputDialog(null, "Укажите размер массива", 
                "Символьный массив", QUESTION_MESSAGE);
        try{
            size=parseInt(input);
            symbs = new char[size];
            String txt ="| ";
            for(int i=0; i<size; i++){
                symbs[i]=(char)('A'+i);
                txt+=symbs[i]+"| ";
            }
            showMessageDialog(null,txt, "Сиволы из массива",
                    INFORMATION_MESSAGE);
            try{
            input=showInputDialog(null,"Укажите индекс элемента",
                    "Индекс элемента массива", QUESTION_MESSAGE);
            index=parseInt(input);
            txt="Индекс - "+index+"\nСивол - "+symbs[index];
            showMessageDialog(null, txt, "Символ", INFORMATION_MESSAGE);
                    }
            catch(ArrayIndexOutOfBoundsException e){
             showMessageDialog(null,"Такого элемента нет!",
                            "Ошибка при выборе индекса", WARNING_MESSAGE);
            }
            finally{
               showMessageDialog(null,"Массив создан успешно",
                            "Информационное сообщение", INFORMATION_MESSAGE); 
            }
        }
        catch(NumberFormatException e){
                    showMessageDialog(null,"К сожалению возникла ошибка ...",
                            "Ошибка", WARNING_MESSAGE);
        }
        catch(NegativeArraySizeException e){
             showMessageDialog(null,"Некорректный размер массива",
                            "Ошибка при созднаии массива", ERROR_MESSAGE);
        }
        
    }
    
}
