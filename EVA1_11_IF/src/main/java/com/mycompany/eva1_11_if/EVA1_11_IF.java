/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
     //CONDICIONAL
//LOGICA BOLEANA ---> OPERACIONES DE VERDADERO Y FALSO
//solicitar la edad en años
     int edad;
     Scanner captu = new Scanner(System.in);
     System.out.println("Captura la edad:");
     edad = captu.nextInt();
     
// DETERMINAR SI ES MAYOR DE EDAD
// LAS OPERACIONES LÓGICAS SOLO SE GENERAN COMO RESULTADO
// UN VERDADERO O UN FALSO 
// si son varias instrucciones las tienen que agrupar con llaves 
if( edad >= 18 ){//BLOQUE PARA EL VERDADERO
        System.out.println("ES UN ADULTO");
    }else{//BLOQUE PARA EL FALSO (OPCIONAL)
            System.out.println("ES MENOR DE EDAD!!");
            }
     
    }
}
