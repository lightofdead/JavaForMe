import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class MyFrame extends JFrame{
    private JLabel lbl;
    private JTextField fld;
    MyFrame(){
        super("Window with text");
        this.setBounds(250, 250, 300, 160);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        lbl = new JLabel();
        lbl.setBounds(10, 10, 250, 30);
        lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        fld = new JTextField();
        fld.setBounds(lbl.getX(), 50, lbl.getWidth(), 30);
        JButton appB = new JButton("Применить");
        appB.setBounds(fld.getX(), 90, (fld.getWidth()-20)/2, 30);
        appB.setFocusPainted(false);
        appB.addActionListener(e->lbl.setText(fld.getText()));
        JButton extB = new JButton("Закрыть");
        extB.setBounds(appB.getX()+appB.getWidth()+20, appB.getY(),
                appB.getWidth(), appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(e->System.exit(0));
        this.add(lbl);
        this.add(fld);
        this.add(appB);
        this.add(extB);
        this.setVisible(true);
    }
}

/**
 *
 * @author 79535
 */
public class TextFieldApp {
    public static void main(String[] args) {
        new MyFrame();
    }
    
}
