abstract class ColoredFigures{
    String color;
    int size;
    ColoredFigures(String color, int size){
        this.color=color;
        this.size=size;
    }
    void show(){
        System.out.println("Фигура:"+color+" "+ getName());
        System.out.println("Характерный размер ("+getSizeName()+") "+size);
        System.out.printf("Площадь: %.3f\n",getArea());
        String line="";
        for(int i=1;i<=30;i++){
            line+="*";
        }
        System.out.print(line+"\n");
    }
    String getSizeName(){
        return "Сторона";
    }
    abstract String getName();
    abstract double getArea();
}
class Triangle extends ColoredFigures{
    Triangle(String color, int size){
        super(color,size);
    }
    String getName(){
        return "Треугольник";
    }
    double getArea(){
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }
}
class Square extends ColoredFigures{
    Square(String color, int size){
        super(color,size);
    }
    String getName(){
        return "Квадрат";
    }
    double getArea(){
        double k=1;
        return size*size*k;
    }
}
class Circle extends ColoredFigures{
    Circle(String color, int size){
        super(color,size);
    }
    String getName(){
        return "Круг";
    }
    double getArea(){
        double k=Math.PI;
        return size*size*k;
    }
    String getSizeName(){
        return "Радиус";
    }
}


public class UsingAbstractClassApp {


    public static void main(String[] args) {
        Triangle T = new Triangle("Красный", 9);
        Square S = new Square("Синий", 5);
        Circle C = new Circle("Белый", 7);
        T.show();
        S.show();
        C.show();
        ColoredFigures F;
        System.out.println("Использование объектной переменной абстрактного "
                + "супер класса");
        F=T;
        F.show();
        F=S;
        F.show();
        F=C;
        F.show();
    }
    
}
