interface MyFunction{
    double f(double x);
}

/**
 *
 * @author 79535
 */
public class IntegralCalcApp {
    static double integrate(MyFunction obj, double a, double b){
        int n = 1000;
        double h = (b-a)/n;
        double s=(obj.f(a)+obj.f(b))*h/2;
        for(int i=0;i<=n;i++){
            s+=h*obj.f(a+i*h);
        }
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println(integrate((double x)->{return x*(1-x);},0,1));
        System.out.println(" - точное значнеие "+1.0/6);
        System.out.println(integrate((double x)->{return 1/x;},1,2));
        System.out.println(" - точное значнеие "+Math.log(2));
        System.out.println(integrate((double x)->{return Math.exp(-x);},0,10));
        System.out.println(" - точное значнеие "+(1-Math.exp(-10)));
    }
    
    
}
