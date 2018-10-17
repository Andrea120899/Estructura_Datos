/**
 * @(#)Ejercicio2.java
 *
 * Ejercicio2 application
 *
 * @author 
 * @version 1.00 2018/10/5
 */
 
package binario;

import java.util.Scanner;

public class Ejercicio2 {

    public static int NumeroBinario(int num) {
        if (num < 0x2) {
            System.out.print(num);
            System.out.print("");
        } else {
            NumeroBinario(num / 2);
            System.out.print(num % 2);
            System.out.print("");
        }
        return 0;
    }

    public static void main(String[] x) {
        int bin;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero decimal: ");
        int enter = entrada.nextInt();
        System.out.print("El binario es: ");
      
        bin = NumeroBinario(enter);
        System.out.println ("");

    }
}
