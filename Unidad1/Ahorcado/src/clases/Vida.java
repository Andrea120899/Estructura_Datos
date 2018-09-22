package clases;

import java.util.Arrays;
import java.util.Scanner;

public class Vida {
	char cadena[];
    char Juego[];
    char veces;
    String[] palabras;
    
   
    public char[] getCadena() {
        return cadena;
}

    public char[] getJuego() {
        return Juego;
    }

    public void setCadena(char[] cadena) {
        this.cadena = cadena;
    }

    public void setJuego(char[] Juego) {
        this.Juego = Juego;
    }
    
    public void Cadena(String[] palabras, int tamaño){
        cadena = palabras[tamaño].toCharArray(); 
        Juego = palabras[tamaño].toCharArray();
    }
    
    public void OcultarCadena(){
        for(int i = 0; i< Juego.length; i++){ 
            Juego[i] = '*';
        }
        System.out.println("Adivina la palabra " + Arrays.toString(Juego));
    }
    
    public void Juego(Scanner en, int i){
       System.out.print(i + " -veces: ");
        veces = en.next().charAt(0);
          for(int x = 0; x < cadena.length ;x++){ 
                if(cadena[x]==veces){
                 Juego[x] = veces;
                }
           } 
    }
    public void Verificacion(int i){
         if(Arrays.equals(cadena, Juego)){
                System.out.println("\nLo has logrado !!!!Felicidades.");
                 i = 6; 
            }else if(i==6){
                System.out.println("\nNoo.Tus intentos se acobaron");
                System.exit(0); 
          }
    }
}