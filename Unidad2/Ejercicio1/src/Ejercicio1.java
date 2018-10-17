/**
 * @(#)Ejercicio1.java
 *
 * Ejercicio1 application
 *
 * @author 
 * @version 1.00 2018/10/5
 */
 
package ejercicio1;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        
Scanner teclado= new Scanner(System.in);

        String NuevaPalabra;
        palindromo objclass=new palindromo();
        System.out.print("Ingresa la palabra o frase: ");
        NuevaPalabra = teclado.nextLine();
        
        if(objclass.espalindromo(NuevaPalabra)){
            System.out.println("Es Palindromo: "+ NuevaPalabra);
        }
        else
        {
            System.out.println("No es un Palindromo: "+NuevaPalabra);
        }
    }
    
}