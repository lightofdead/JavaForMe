import javax.swing.*;

public class UsingIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input,txt,title;
        int number;
        ImageIcon img;
        input = JOptionPane.showInputDialog(null, "Введите целое число", "Проверка числа", 
                JOptionPane.QUESTION_MESSAGE);
        if (input==null){JOptionPane.showMessageDialog(null, "Число не введено!", "Ошибка ввода", 
                    JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
        number= Integer.parseInt(input);
        if(number%2==0){
            img = new ImageIcon("e:/even.png");
            txt = "Число "+number+" - четное!";
            title="Четное число";
        }
        else{
            img = new ImageIcon("e:/odd.png");
            txt = "Число "+number+" - нечетное!";
            title="Нечетное число";
        }
        
       JOptionPane.showMessageDialog(null, txt, title, JOptionPane.PLAIN_MESSAGE, img);
        }
    }
    

