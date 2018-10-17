/**
 * @(#)palindromo.java
 *
 *
 * @author 
 * @version 1.00 2018/10/5
 */

package ejercicio1;

public class palindromo {

    public static boolean espalindromo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else {
            if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
                return espalindromo(cadena.substring(1, cadena.length() - 1));
            } else {
                return false;
            }
        }
    }
}
