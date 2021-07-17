import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
    MyFrame(String name){
        super(name);
        this.setBounds(250, 250, 400, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        ImageIcon img = new ImageIcon("d:/pics/giraffe.png");
        String txt ="<html>Это жираф.<br>Он большой.<br>?</html>";
        JLabel lbl = new JLabel(txt,img, JLabel.LEFT);
        Font F = new Font(Font.MONOSPACED, Font.BOLD, 16);
        lbl.setFont(F);
        lbl.setBounds(20, 10, 350, 100);
        lbl.setOpaque(true);
        lbl.setBackground(Color.BLACK);
        lbl.setForeground(Color.GREEN);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        this.add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(100,120,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(e->{System.exit(0);});
        this.add(btn);
        this.setVisible(true);
    }
} 
/**
 *
 * @author 79535
 */
public class LambdaHendlerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyFrame("Window with animal");
    }
    
}
