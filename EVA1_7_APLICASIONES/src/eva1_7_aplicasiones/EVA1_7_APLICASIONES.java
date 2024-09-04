/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_aplicasiones;

/**
 *
 * @author invitado
 */
public class EVA1_7_APLICASIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //OPERCACIONES ARITMETICAS
       int x = 10; //Dleclaracion y asignación
       int y = 5;
       //Decalracion de múltiples variables del mismo tipo
       int suma, resta, divi, multi, pot, raiz;
        //SUMA Y RESTA
       suma = x + y; //operador de suma +
       System.out.println("suma de x + y: ");
       System.out.println(suma);
       
       resta = x - y; //Operador de diferencia -
       System.out.println("Resta de x - y: ");
       System.out.println(resta);
       
       //MULTIPLICACION
       multi = x * y;//Operador de multiplicacion *
       System.out.println("Multi de x * y: ");
       System.out.println(multi);
       
       //DIVICION ----> EL MANEJO DE TIPOS DE DATOS
       //Si dividimos enteros, java da como resultado un entero
       divi = x / y;//Operacion de divicion
       System.out.println("Divicion de x / y:");
       System.out.println(divi);
       //cambiamos los valores 
       x = 5;
       y = 2;
        divi = x / y;
        System.out.println("Divicion x(5) / y(2)");
        System.out.println(divi);
        
        double va11 = 11;
        double va12 = 3;
        double diviD;
        diviD = va11 / va12;
        System.out.println("Divicion entre # decumales");
        System.out.println(diviD);
       

    }
    
}
