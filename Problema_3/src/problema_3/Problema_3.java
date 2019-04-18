/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3;

import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
public class Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner entrada = new Scanner(System.in);
       
       String valor1, valor2, valor3; // declaracion de variables
       double promedio;
       
       System.out.println("Ingrese la nota 1:"); // ingresando nota 1
       valor1 = entrada.nextLine();
       System.out.println("Ingrese la nota 2:"); // ingresando nota 2
       valor2 = entrada.nextLine();
       System.out.println("Ingrese la nota 3:"); // ingresando nota 3
       valor3 = entrada.nextLine();
       
       double dvalor1 = Double.parseDouble(valor1); // convertir de cadena a decimal valor 1
       double dvalor2 = Double.parseDouble(valor2); // convertir de cadena a decimal valor 2
       double dvalor3 = Double.parseDouble(valor3); // convertir de cadena a decimal valor 3
       
       promedio = (dvalor1 + dvalor2 + dvalor3)/3; // sacando promedio suma de los valores dividido para 3
       
       String comparacion = promedio > 14 ? "Usted esta aprovado el año" : 
               "Usted esta reprovado"; // comparando el el promedio para ver si es mayor o menor que 14
       
       System.out.printf("%s \n", comparacion); // imprimiendo en pantalla el resultado si esta aprobado o reporbado
       
    }
    
}
