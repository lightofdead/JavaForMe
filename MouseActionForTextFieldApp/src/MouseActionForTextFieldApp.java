import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener, MouseListener{
    
    private JLabel lbl;
    private JTextField tfld;
    private String apply = "Применить";
    private String ext= "Закрыть";
   
    @Override
    public void actionPerformed(ActionEvent ae) {
       String txt=ae.getActionCommand();
       if(txt.equals(ext)){
           System.exit(0);
       }
       if(txt.equals(apply)){
           lbl.setText(tfld.getText());
       } 
       
    }

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {
        lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        lbl.setHorizontalAlignment(JLabel.RIGHT);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        lbl.setHorizontalAlignment(JLabel.LEFT);
    }
    
    MyFrame(String name){
        super(name);
        int w = 300, h = 160;
        this.setBounds(250, 250, w, h);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lbl = new JLabel();
        lbl.setBounds(10, 10, w-25, 30);
        lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        lbl.addMouseListener(this);
        tfld = new JTextField();
        tfld.setBounds(lbl.getX(), lbl.getY()+40, lbl.getWidth(), lbl.getHeight());
        int bw = (lbl.getWidth()-20)/2;
        JButton appB = new JButton(apply);
        appB.setBounds(tfld.getX(), 90, bw, 30);
        appB.setFocusPainted(false);
        appB.addActionListener(this);
        JButton extB = new JButton(ext);
        extB.setBounds(appB.getX()+bw+20, appB.getY(), bw, appB.getHeight());
        extB.setFocusPainted(false);
        extB.addActionListener(this);
        this.add(lbl);
        this.add(tfld);
        this.add(appB);
        this.add(extB);
        this.setVisible(true);
    }
    
}

/**
 *
 * @author 79535
 */
public class MouseActionForTextFieldApp {
    public static void main(String[] args) {
        new MyFrame("Windiw with 2 Buttons");
    }
    
}
