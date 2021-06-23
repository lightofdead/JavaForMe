import javax.swing.*;
import java.util.Random;

public class UsingForArrayApp {

    
    public static void main(String[] args) {
       Random rnd = new Random();
       String size = JOptionPane.showInputDialog(null,"Введите размерность "
               + "матрицы", "Ввод", JOptionPane.PLAIN_MESSAGE);
       int[] nums = new int[Integer.parseInt(size)];
       String txt= "Массив случайных чисел:\n";
       for(int i=0;i<nums.length;i++){
           nums[i]= rnd.nextInt(10)+1;
           txt+=nums[i]+"|";
       }
       txt+="\nПроверка:\n";
       for(int i:nums){
           txt+=i+"|";
       }
       JOptionPane.showMessageDialog(null, txt, "Random nums", 
               JOptionPane.PLAIN_MESSAGE);
    }
    
}
