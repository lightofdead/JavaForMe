import javax.swing.JFrame;

class MyFrame extends JFrame{
    MyFrame(String name){
        super(name);
        setBounds(250,250,350,250);
        setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

/**
 *
 * @author 79535
 */
public class SimpleWindowApp {
    public static void main(String[] args) {
        MyFrame wnd = new MyFrame("Simple Window");
    }
    
}
