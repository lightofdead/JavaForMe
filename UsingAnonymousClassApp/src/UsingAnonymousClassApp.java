interface MyNums{
    default void show(int n){
        System.out.println("Аргумент"+n);
        System.out.println("Результат"+get(n));
    }
    int get(int n);
}

/**
 *
 * @author 79535
 */
public class UsingAnonymousClassApp {

    public static void main(String[] args) {
        MyNums A = new MyNums(){
            public int get(int n){
                int k,s = 0;
                for(k=1;k<=n;k++){
                    s+=k;
                }
                return s;
            }
        };
        System.out.println("Использование анонимного класса:");
        A.show(10);
        System.out.println("Проверка: " +A.get(10));
        MyNums B = A;
        System.out.println("Новый анонимный класс");
        A = new MyNums(){
            @Override
            public int get(int n) {
               return n*n; 
            }
            };
        System.out.println("Вызов метода show() из A: ");
        A.show(10);
        System.out.println("Вызов метода show() из B: ");
        B.show(10);
    }
    
}
