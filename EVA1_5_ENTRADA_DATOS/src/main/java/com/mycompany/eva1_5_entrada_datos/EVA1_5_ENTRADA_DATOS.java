/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
      //DECLARAMOS VARIABLES
      String marca;
      String modelo;
      int year;
      double precio;
      
      //¿Como Se Captura?
      //SCANNER
      //Herramienta --¨z clase nos proporcionan muchas herramientas
     Scanner captu;    //delcaramos la herramient, previamente
                      // hay que importarla (hacer un import)
     captu = new Scanner(System.in); //creamos la herramienta
     
     //HAY QUE INDICARLE AL USUARIO QUE CAPTURARON
     System.out.println("Introduce la marca del vehiculo:");
     //capturamos --- una asignacion
     marca = captu.nextLine();//Les regresa todo el texto hasta cuando se 
                             //preciona la tecla "enter"
     System.out.println(marca);
     modelo = captu.nextLine();
     System.out.println("Introduce el año:");
     year = captu.nextInt();
     System.out.println("Introduce el precio:");
     precio = captu.nextDouble();
     System.out.println("DATOS CAPTURADOS---------------");
     System.out.println("marca");
     System.out.println("modelo");
     System.out.println("year");
     System.out.println("precio");
    }
}
