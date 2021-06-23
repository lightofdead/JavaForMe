import javax.swing.JOptionPane;

class MyClass{
    int number;
    char symbol;
    //overloading
    void set(int a){
        number = a;
    }
    void set(char s){
        symbol = s;
    }
    void set(int a, char s){
        set(a);
        set(s);
    }
    void set(){
    set(0,'z');
    }
    void show(){
        String txt= "значения полей "+number+ " и "+symbol; 
        JOptionPane.showMessageDialog(null, txt);
    }
    void show(String txt){
        String text= txt+"значения полей "+number+ " и "+symbol; 
        JOptionPane.showMessageDialog(null, text);
    }
    void show(String txt1, String txt2){
        String text= txt1+": "+number+"\n"+txt2+": "+symbol;
        JOptionPane.showMessageDialog(null, text);
    }
    String getInfo(){
    String text = "Число: "+number+"\n";
    text+="Символ: "+symbol;
    return text;
    }
}

public class P3 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1.set(3);
        obj1.set('g');
        obj1.show("Первый символ", "Второй символ");
        obj2.set();
        obj2.show();
        /*JOptionPane.showMessageDialog(null, obj1.getInfo(), "Первый объект", 
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, obj2.getInfo(), "Second объект", 
                JOptionPane.INFORMATION_MESSAGE);*/
    }
    
}
