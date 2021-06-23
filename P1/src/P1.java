import javax.swing.JOptionPane;
import java.util.Scanner;

public class P1 {

    
    public static void main(String[] args) {
        //диалоговые окна
        int age, year=2021;
        double mass, height, bmi;
        String title = "Контролируй свой вес!";
        String yourAge = JOptionPane.showInputDialog("Введите ваш возраст в годах");
        String yourMass = JOptionPane.showInputDialog("Введите ваш вес в килограммах");
        String yourHeight = JOptionPane.showInputDialog("Введите ваш рост в метрах");
        age =Integer.parseInt(yourAge);
        int yearOfBorn = year-age;
        mass = Double.parseDouble(yourMass);
        height = Double.parseDouble(yourHeight);
        bmi=(mass/(height*height));
        bmi=Math.round(bmi*100)/100;
        String textx = "Ваш возраст: "+Integer.toString(age)+" года/лет\n";
        textx=textx+"Вы родились в: "+Integer.toString(yearOfBorn)+" году\n";
        textx=textx+"Ваше вес: "+mass+"кг\n";
        textx=textx+"Ваш рост: "+height+"м\n";
        textx+="Ваш индекс массы тела= "+bmi;
        JOptionPane.showMessageDialog(null,textx, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
