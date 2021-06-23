import javax.swing.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class MyPane extends JOptionPane{
    static void showMessage(String txt, String title){
    showMessageDialog(null,txt,title, PLAIN_MESSAGE,
            new ImageIcon("d:/pics/giraffe.png"));
}
    static void showMessage(String txt){
        showMessage(txt, "Сообщение");
    }
    static int getInteger(String txt){
        String res;
        res=showInputDialog(null,txt,"Число, (по умолчанию 10))",QUESTION_MESSAGE);
        if(res==null){
            return 10;
        }
        else{
            return Integer.parseInt(res);
        }
        
    }
}
/**
 *
 * @author LightOfDead
 */
public class ExtendingJOptionPaneApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPane.showMessage("Всем ку");
        int number=MyPane.getInteger("Введите целое число");
        String txt = "Числа от 1 до "+number+"\n";
        for(int i=1; i<=number;i++){
            txt+=i+" ";
        }
        MyPane.showMessage(txt, "Целые числа");
    }
    
}
