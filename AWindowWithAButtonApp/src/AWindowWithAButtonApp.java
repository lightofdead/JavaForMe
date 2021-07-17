import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
    MyFrame(){
        super("Window with button");
        this.setBounds(250, 250, 400, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        JLabel lbl = new JLabel("Для закрытия окна нажмите соответствующую"
                + " кнопку");
        lbl.setBounds(40, 30, 350, 50);
        this.add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(100,120,200,30);
        MyHandler hnd= new MyHandler();
        btn.addActionListener(hnd);
        this.add(btn);
        this.setVisible(true);
    }
}

class MyHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
       System.exit(0);
    }
    
}

/**
 *
 * @author 79535
 */
public class AWindowWithAButtonApp {
    public static void main(String[] args) {
        new MyFrame();
    }
    
}
