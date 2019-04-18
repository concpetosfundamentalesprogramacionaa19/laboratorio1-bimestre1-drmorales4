/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_1;

import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
public class Problema_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declarando variables
        double horas;
        double costohora;
        double sueldomensual;
        double descuento;
        double sueldofinal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese numero de horas trabajadas: "); // ingreso de datos de las horas trabajadas
        horas = entrada.nextDouble();
        System.out.println("Ingrese el costo de cada hora trabajada: "); // ingreso de datos del costo de cada hora trabajada
        costohora = entrada.nextDouble();
        
        sueldomensual = horas*costohora;  // sacando el sueldo original sin el descuento
        descuento = sueldomensual*0.10;   // sacando el descuento del 10% al sueldo original
        sueldofinal = sueldomensual-descuento;  // el valor del suelto fial, restando el sueldo original menos que descuento del 10 %
        
        
        System.out.printf("Su sueldo a pagar es: %.2f \nCon un descuento de"
                + "; %.2f",sueldofinal, descuento);  // imprimiendo en pantalla el sueldo a pagar a ese trabajador y el descuento que hubo
        
    }
    
}
