import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyButton extends JButton implements ActionListener{  
    @Override
    public void actionPerformed(ActionEvent ae) {
       System.exit(0); 
    }
    MyButton(int x, int y, int w, int h){
        super("Закрыть окно");
        this.setBounds(x, y, w, h);
        this.setFocusPainted(false);
        this.addActionListener(this);
    }
}
class MyPanel extends JPanel{
    MyPanel(String txt, ImageIcon img){
        super();
        this.setBounds(5,5,285,110);
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(null);
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10, 10, 90, 90);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt,JLabel.CENTER);
        txtLbl.setBounds(100, 10, 180, 90);
        txtLbl.setOpaque(true);
        txtLbl.setBackground(Color.BLACK);
        txtLbl.setForeground(Color.GREEN);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        Font F = new Font(Font.MONOSPACED,
                          Font.BOLD|Font.ITALIC, 
                          16);
        txtLbl.setFont(F);
        this.add(imgLbl);
        this.add(txtLbl);
    }
}

class MyFrame extends JFrame{
    MyFrame(String name, String txt, ImageIcon img){
        super(name);
        this.setBounds(250, 250, 300, 200);
        this.setResizable(false);
        this.setLayout(null);
        MyPanel pnl = new MyPanel(txt, img);
        MyButton btn = new MyButton(80,120,130,30);
        this.add(btn);
        this.add(pnl);
        this.setVisible(true);
    }
}

/**
 *
 * @author 79535
 */
public class ButtonAndHandlerApp {
    public static void main(String[] args) {
        String txt ="<html>Это жираф.<br>Он большой.<br>?</html>";
        ImageIcon img = new ImageIcon("d:/pics/giraffe.png");
        new MyFrame("Animal",txt, img);
    }
    
}
