/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
     //DECLARAR VARIABLE PARA LA CALIFICACION
     //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70)
     //O NO ACREDITAS (NA --> A 70)
     int calificacion;
     Scanner captu = new Scanner(System.in);
     System.out.println("INGRESA TU CALIFICACION");
     calificacion = captu.nextInt();
    
     if(calificacion >= 70){
         System.out.println("ACREDITAS!!");
         
     }else{
         System.out.println("NA");
     }
        
    }
}
