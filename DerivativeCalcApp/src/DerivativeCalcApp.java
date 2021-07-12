interface MyFunction{
    double f(double x);
}

/**
 *
 * @author 79535
 */
public class DerivativeCalcApp {
    static MyFunction Derivative(MyFunction ref){
        double dx=1e-5;
        return(double x)->{return(ref.f(x+dx)-ref.f(x))/dx;};
    }
 
    public static void main(String[] args) {
        MyFunction A=Derivative((double x)->{return x*(3-x);});
        MyFunction B=Derivative((double x)->{return x*Math.exp(-x);});
        System.out.println("Производная для первой функции");
        System.out.println("Вычислено:\tТочно:");
        for(double d=0;d<=5;d++){
            System.out.printf("%8.5f\t%8.5f\n",A.f(d),(3-2*d));
        }
        System.out.println("Производная для второй функции");
        System.out.println("Вычислено:\tТочно:");
        for(double d=0;d<=5;d++){
            System.out.printf("%8.5f\t%8.5f\n",B.f(d),Math.exp(-d)*(1-d));
        }
    }
    
}
