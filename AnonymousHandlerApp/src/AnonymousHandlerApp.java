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
        JLabel lbl = new JLabel("Текст синего цвета", JLabel.CENTER);
        lbl.setBounds(20, 30, 350, 50);
        lbl.setForeground(Color.BLUE);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        this.add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(100,120,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
            
        });
        this.add(btn);
        this.setVisible(true);
    }
}    

/**
 *
 * @author 79535
 */
public class AnonymousHandlerApp {
    public static void main(String[] args) {
        new MyFrame("Window");
    }
}
    
