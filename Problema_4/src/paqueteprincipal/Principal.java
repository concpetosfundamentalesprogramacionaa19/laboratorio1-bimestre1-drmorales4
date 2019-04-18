/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// @drmorales4
package paqueteprincipal;

import paquete1.*; // importando paquete 1
import paquete2.*; // importando paquete 2
import paquete3.*; // importando paquete 3

/**
 *
 * @author DAVID
 */
// @drmorales4

public class Principal { 
    public static void main(String[] args) { // main
        String resultado; // declarado variable
        resultado = MiClase1.edad >= 18 ? "mayor de edad" : "menor de edad"; // comparando si edad es mayor o menor de 18
        
        System.out.printf("Nombre:\n\t%s \nApellido:\n\t %s \nEdad %d y %s"
                , MiClase2.nombre, MiClase3.apellido, MiClase1.edad, resultado); 
        // imprimiendo en pantalla los resultados
    }
    
}
