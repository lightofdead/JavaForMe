import javax.swing.*;

/**
 *
 * @author LightOfDead
 */



public class UsingArrayApp {

 
    public static void main(String[] args) {
        int n;
        String title="Биноминальные коэффициенты";
        String input=JOptionPane.showInputDialog(null,"укажите значение нижнего "
                + "индекса",title,JOptionPane.QUESTION_MESSAGE);
        if(input==null){
            System.exit(0);
        }
        n=Integer.parseInt(input);
        if(n<0){
            JOptionPane.showMessageDialog(null, "Указан невенрный параметр"
                    , title, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int[] binoms = new int[n+1];
        binoms[0]=1;
        String txt="Содержимое массива:\n| "+binoms[0]+" |";
        for(int i=1;i<binoms.length;i++){
            binoms[i]=binoms[i-1]*(n-i+1)/i;
            txt+=" "+binoms[i]+" |";
            JOptionPane.showMessageDialog(null, txt,title,JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
        
    }
        
}
