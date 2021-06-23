package p2;
import javax.swing.JOptionPane;

class MyClass{
    int number;
    String text;
}

public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.number = Integer.parseInt(JOptionPane.showInputDialog("Введите число"));
        
        obj.text= JOptionPane.showInputDialog("Введите текст");
        String text="номер = "+obj.number+"\n";
        text+="текст = "+obj.text;
        JOptionPane.showMessageDialog(null, text);
    }
    
}
