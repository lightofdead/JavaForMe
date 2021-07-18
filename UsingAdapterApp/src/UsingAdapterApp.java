import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    private JLabel lbl;
    private JTextField tfld;
    private JButton extB;
    private String fontName = "Arial";
    private int fontSize = 15;
    private String ext = "Закрыть";
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    MyFrame(){
        super("Окно с полями и кнопкой");
        this.setBounds(250, 250, 360, 160);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        lbl = new JLabel();
        lbl.setBounds(10, 10, this.getWidth()-25, 30);
        lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        lbl.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent me){
                lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
                lbl.setHorizontalAlignment(JLabel.CENTER);
            }
            public void mouseExited(MouseEvent me){
                lbl.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                lbl.setHorizontalAlignment(JLabel.LEFT);
            }
        });
        tfld = new JTextField();
        tfld.setBounds(lbl.getX(), lbl.getY()+40, lbl.getWidth(), lbl.getHeight());
        tfld.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent ke){
                lbl.setText(tfld.getText());
            }
        });
        extB = new JButton(ext);
        extB.setBounds(80, 90, this.getWidth()/2+25, lbl.getHeight()+10);
        extB.setFocusPainted(false);
        extB.setFont(new Font(fontName, Font.PLAIN, fontSize));
        extB.setForeground(Color.BLUE);
        extB.addActionListener(this);
        extB.addMouseListener(new MouseAdapter(){
            public void mouseExited(MouseEvent me){
                extB.setText(ext);
                extB.setFont(new Font(fontName, Font.PLAIN, fontSize));
                extB.setForeground(Color.blue);
            }
            public void mouseEntered(MouseEvent me){
                extB.setText("<html><u>"+ext+"</u></html>");
                extB.setFont(new Font(fontName, Font.BOLD, fontSize+3));
                extB.setForeground(Color.RED);
            }
        });
        this.add(lbl);
        this.add(tfld);
        this.add(extB);
        this.setVisible(true);
    }
    
}

/**
 *
 * @author 79535
 */
public class UsingAdapterApp {

    public static void main(String[] args) {
        new MyFrame();
    }
    
}
