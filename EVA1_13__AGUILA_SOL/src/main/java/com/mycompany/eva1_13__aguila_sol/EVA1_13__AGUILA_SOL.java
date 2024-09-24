/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13__aguila_sol;

/**
 *
 * @author nancy
 */
public class EVA1_13__AGUILA_SOL {

    public static void main(String[] args) {
     //ALEATORIO
     //GENERAR NÚMEROS ALEATORIOS
      double valor = Math.random();
     //random genera calores >= 0 y < a 1
     //ENTRE 0 Y .99999999999
     //0 1 2 3 4 5 6 7 8 9
       if(valor < 0.5){
       System.out.println("Aguila");    
       }else{
           System.out.println("Sol");
       }
    }
}
