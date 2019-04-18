/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;

import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
public class Problema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declarando variables
        String x,y,z;
        double m;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor Ingrese X:"); // ingresando valor de x
        x = entrada.nextLine();
        System.out.println("Por favor Ingrese Y:"); //ingresando valor de y
        y = entrada.nextLine();
        System.out.println("Por favor Ingrese Z:"); // ingresando valor de z
        z = entrada.nextLine();
        
        double valorx = Double.parseDouble(x); // conversion de cadena de texto a decimal el valor de x
        double valory = Double.parseDouble(y); // conversion de cadena de texto a decimal el valor de y
        double valorz = Double.parseDouble(z); // conversion de cadena de texto a decimal el valor de z
        
        m = (valorx+(valory/valorz))/(valorx-(valory/valorz)); // realizando la operacion segun la formula pedida
        
        System.out.printf("El valor de m, en base a las variables: \nx= %.1f " 
                + "\n\ty= %1f \n\t\tz= %.1f \nda como resuldo: \n\t\t %.2f"
                ,valorx,valory,valorz,m);
        // presentacion en pantalla de los valores de x, y, z, y tambien del valor de "m"
    }
    
}
