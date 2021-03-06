import javax.swing.*;

class UsingWhile{
    static int decoder(String code){
        int n = code.length();
        int s =0,k=1,q=1, a;
        while (k<=n){
            if(code.charAt(n-k)=='1'){
                a=1;
            }
            else{
                a=0;
            }
            s+=q*a;
            q*=2;
            k++;
        }
        return s;
    }
}
/**
 *
 * @author LightOfDead
 */
public class UsingWhileWithBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        String title="Расшифровка бинарного кода";
        input=JOptionPane.showInputDialog(null, "Введите бинарный код", title,
                JOptionPane.QUESTION_MESSAGE);
        if(input==null){
            System.exit(0);
        }
        int num=UsingWhile.decoder(input);
        String text="Вы ввели бинарный код"+input;
        text+="\nКод соответствует числу: "+num;
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
