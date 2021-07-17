import javax.swing.JFrame;
/**
 *
 * @author 79535
 */
public class JustAWindow {

    public static void main(String[] args) {
        JFrame wnd = new JFrame("Пустое окно");
        wnd.setSize(350, 250);
        wnd.setLocation(250,250);
        wnd.setResizable(false);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }
    
}
