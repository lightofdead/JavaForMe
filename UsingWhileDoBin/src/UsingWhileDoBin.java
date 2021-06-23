import javax.swing.*;

/**
 *
 * @author LightOfDead
 */
class UsingWhileDo{
    static String coder(int number){
        String s ="";
        int n = number;
        do{
            s=(n%2)+s;
            n/=2;
        }while(n!=0);
        return s;
    }
}

public class UsingWhileDoBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bin, title = "Определение бинарного кода";
        String input = JOptionPane.showInputDialog(null, "Введите десятиченое "
                + "число", title, JOptionPane.INFORMATION_MESSAGE);
        if(input==null){
            System.exit(0);
        }
        bin = UsingWhileDo.coder(Integer.parseInt(input));
        JOptionPane.showMessageDialog(null,"Число: "+input+" в двоичном виде "
                + "равно:\n"+bin, title,
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
