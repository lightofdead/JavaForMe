import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    MyFrame(String name){
        
        super(name);
        this.setBounds(250, 250, 400, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        JPanel pnl = new JPanel();
        pnl.setBounds(5, 5, 285, 110);
        pnl.setBorder(BorderFactory.createEtchedBorder());
        pnl.setLayout(null);
        ImageIcon img = new ImageIcon("d:/pics/giraffe.png");
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10, 10, 90, 90);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        String txt ="<html>Это жираф.<br>Он большой.<br>?</html>";
        JLabel txtLbl = new JLabel(txt,JLabel.CENTER);
        txtLbl.setBounds(100, 10, 180, 90);
        txtLbl.setOpaque(true);
        txtLbl.setBackground(Color.BLACK);
        txtLbl.setForeground(Color.GREEN);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(100,120,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(this);  
        Font F = new Font(Font.MONOSPACED,
                Font.BOLD|Font.ITALIC, 
                btn.getFont().getSize()+5);
        txtLbl.setFont(F);
        pnl.add(imgLbl);
        pnl.add(txtLbl);
        this.add(pnl);
        this.add(btn);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0); //To change body of generated methods, choose Tools | Templates.
    }
}
/**
 *
 * @author 79535
 */
public class WindowAsHandlerApp {
    public static void main(String[] args) {
        new MyFrame("Window with panel");
    }
    
}
