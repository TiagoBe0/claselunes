/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gitlunes;

/**
 *
 * @author PUESTO 1
 */
public class Gitlunes {

    public static void main(String[] args) {
       try {
            int[] numeros = {1, 2, 3};
            System.out.println("Accediendo al cuarto elemento: " + numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo."+e.getMessage());
        }
        System.out.println("Fin del programa.");
    

        
        
        
        
        
    }
}
