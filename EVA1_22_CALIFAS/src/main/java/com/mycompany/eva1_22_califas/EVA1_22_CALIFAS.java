/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA1_22_CALIFAS {

    public static void main(String[] args) {
  int Calificasiones;
      Scanner captu = new Scanner(System.in);
      System.out.println("Introduce la calificasion:");
      Calificasiones = captu.nextInt();
     
    if ((Calificasiones >= 90) && (Calificasiones <= 100 )){
         System.out.println("A");
      }else if((Calificasiones >= 80) && (Calificasiones <= 89 )) {
         System.out.println("B");
      }else if((Calificasiones >= 70) && (Calificasiones <= 79 )){
         System.out.println("C");
      }else if((Calificasiones >= 60) && (Calificasiones <= 69 )){
         System.out.println("D");
      }else if((Calificasiones >= 0) && (Calificasiones <= 59 )){
         System.out.println("F");
      }
      
 }
    
}
