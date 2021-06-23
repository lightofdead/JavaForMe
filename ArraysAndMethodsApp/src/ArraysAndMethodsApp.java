class ArraysAndMethods{
    static void show1D(int[] nums){
        for(int s:nums){
            System.out.printf("%4d", s);
        }
        System.out.println("");
    }
    static void show2D(int[][] nums){
        for(int[] p:nums){
            for(int s: p){
                System.out.printf("%4d", s);
            }
            System.out.println("");
        }
    }
    static int[] prod(int[][] A,int[] B){
        int[] C = new int[A.length];
        for(int i=0;i<C.length;i++){
            C[i]=0;
            for(int j=0;j<B.length;j++){
                C[i]+=A[i][j]*B[j];
            }
        }
        return C;
    }
}


public class ArraysAndMethodsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] A={{1,0,3,-1},{2,-1,-2,3},{-1,1,0,2}};
        int[] B={1,-1,3,2};
        int[] C=ArraysAndMethods.prod(A,B);
        System.out.println("Матрица А:");
        ArraysAndMethods.show2D(A);
        System.out.println("Вектор B:");
        ArraysAndMethods.show1D(B);
        System.out.println("Вектор C=AB:");
        ArraysAndMethods.show1D(C);
    }
    
}
