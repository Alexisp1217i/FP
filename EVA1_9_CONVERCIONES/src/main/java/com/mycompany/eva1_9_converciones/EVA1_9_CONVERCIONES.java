/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_converciones;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA1_9_CONVERCIONES {

    public static void main(String[] args) {

        double fahrenheit, centigrados, kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperatura en grados fahrenheit:");
        fahrenheit = captu.nextDouble();
        centigrados = (fahrenheit - 32) / 1.8;
        System.out.println("° =" + centigrados);
        
        //De centigrados a fahrenheit
         System.out.println("Temperatura en grados centigrados:");
        centigrados = captu.nextDouble();
        fahrenheit = centigrados * 1.8 + 1.8;
        System.out.println("°F =" + fahrenheit);
        
        //De fahrenheit a kelvin
        System.out.println("Temperatura en grados kelvin:");
        fahrenheit = captu.nextDouble();
        kelvin = ((fahrenheit - 32) / 1.8) + 273.15;
        System.out.println("°K =" + kelvin);
        
        
        
        
    }
}
