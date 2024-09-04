/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_peliculas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_PELICULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //DELCLARAMOS LAS VARIABLES
        String Nombre;
        String Genero;
        int Duración;
        String Clasi;
        
        //Añado la herramienta Scanner
        Scanner captu;
        
        captu = new Scanner(System.in); //creamos la herramienta
        
         System.out.println("Introducir El Nombre de la Pelicula:");
          Nombre = captu.nextLine();
           System.out.println(Nombre);
        
           System.out.println("Introduce El Genero De La Pelicula:");      
               Genero = captu.nextLine();
            
           System.out.println("Introduce la duracion:");
             Duración = captu.nextInt();
          
           System.out.println("Introduce la clasificacion:");
             Clasi = captu.nextLine();
             
         System.out.println("Todo El Publico");
         System.out.println("Nombre");
         System.out.println("Genero");
         System.out.println("Clasi");
    }
    
}
