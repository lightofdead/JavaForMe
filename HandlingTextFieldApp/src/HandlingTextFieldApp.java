import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
        
class MyFrame extends JFrame implements ActionListener, MouseListener, KeyListener{
    private JLabel lbl;
    private JTextField tfld;
    private JButton B;
    private String fontName = "Arial";
    private int fontSize = 15;
    private String ext = "Закрыть";
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) { }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==lbl){
            lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            lbl.setHorizontalAlignment(JLabel.RIGHT);
        }
        if(me.getSource()==B){
            B.setText("<html><u>"+ext+"</u></html>");
            B.setBackground(Color.RED);
            B.setFont(new Font(fontName, Font.BOLD, fontSize+2));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource()==lbl){
            lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            lbl.setHorizontalAlignment(JLabel.LEFT);
        }
        if(me.getSource()==B){
            B.setText(ext);
            B.setForeground(Color.blue);
            B.setFont(new Font(fontName, Font.PLAIN, fontSize));
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {
        lbl.setText(tfld.getText());
    }
    
    MyFrame(){
        super("Окно с кнопкой");
        this.setBounds(250, 250, 360, 160);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        lbl = new JLabel();
        lbl.setBounds(10, 10, 275, 30);
        lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        lbl.addMouseListener(this);
        tfld = new JTextField();
        tfld.setBounds(lbl.getX(), lbl.getY()+40, lbl.getWidth(), lbl.getHeight());
        tfld.addKeyListener(this);
        B = new JButton(ext);
        B.setBounds(60, 90, this.getWidth()/2+25, lbl.getHeight());
        B.setFocusPainted(false);
        B.setForeground(Color.blue);
        B.setFont(new Font(fontName, Font.PLAIN, fontSize));
        B.addActionListener(this);
        B.addMouseListener(this);
        this.add(lbl);
        this.add(tfld);
        this.add(B);
        this.setVisible(true);
    }
}

/**
 *
 * @author 79535
 */
public class HandlingTextFieldApp {
    public static void main(String[] args) {
        new MyFrame();
    }
    
}
