import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LightOfDead
 */
public class UsingFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s= 0, k, n=10;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(k=1;k<=n;k++){
            s+=k*k;
        }
        String text = "Сумма кводратов чисел от 1 до "+n+" равна = "+s;
        System.out.println(text);
    }
    
}
