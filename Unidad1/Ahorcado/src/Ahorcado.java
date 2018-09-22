package Ahorcado;

import clases.Vida;
import java.util.Scanner;
import java.util.Random;

public class Ahorcado {
    
    public static void main(String[] args) {   	
    	
       Scanner entrada = new Scanner(System.in);
       Random r = new Random();
       String[] palabras = {"zorro", "elefante", "mariposa", "caballo", "mono", "murcielago"};
       int n_azar = r.nextInt(palabras.length); 
       
       Vida pro = new Vida(); 
       
       pro.Cadena(palabras, n_azar);
       pro.OcultarCadena();
       
       for(int i = 1; i <= 6; i++){
           pro.Juego(entrada, i);
           pro.Verificacion(i);
            System.out.println(pro.getJuego()); 
       }
    }
}