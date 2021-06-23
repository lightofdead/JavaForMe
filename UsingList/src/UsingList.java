import javax.swing.*;

/**
 *
 * @author LightOfDead
 */
class Animals{
    static String fileBear ="bear.jpg";
    static String fileWolf ="wolf.jpg";
    static String fileFox ="fox.jpg";
    static String fileRacoon ="racoon.jpg"; 
    static String[] animalsFile = {fileWolf, fileFox, fileBear, fileRacoon};
}

public class UsingList {


    public static void main(String[] args) {
        String[] txt = {"Волк", "Лиса", "Медведь", "Енот"};
        String animal;
        String title="В мире животных";
        String msg="Кого показать?";
        String folder ="e:/pics/";
        ImageIcon img = new ImageIcon(folder+"giraffe.png");
        animal=(String)JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE, img, txt, txt[0]);
        if(animal==null){
            System.exit(0);
        }
        for(int i=1;i<=txt.length;i++){
            if(animal.equals(txt[i])){
                img=new ImageIcon(folder+Animals.animalsFile[i]);
                break;
            }            
        }
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);
    }
    
}
