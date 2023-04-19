/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jugador;

/**
 *
 * @author aysanchez6
 */
public class Jugador {
     
   
       
   
       private String cedula;
       private String nombre;
       private String apellido;
       private int edad;
       
       
    public void caminar(){
        
        System.out.println(nombre + apellido + edad + cedula +  "estan "
                + "caminando");
        
    }
    public void correr(){
        System.out.println(nombre + apellido + edad + cedula+ "esta corriendo");
        
    }
    public void viajar(){
        System.out.println(nombre + apellido + edad + cedula+ "esta viajando");
        
    }
}
