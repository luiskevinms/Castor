/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.castor.business;

/**
 *
 * @author alumnog
 */
public class Temperatura {
    
    /**
     * Convertir grados centigrados a farenheit
     * @param centigrados la cantidad de grados centigrados que planeamos convertir
     * @return El valor convertido a grados farenheit 
     */
    public static double convertirGrados(double centigrados){
        return centigrados * 1.8 + 32;
    }
    
    public static int calcularPerimetro (int lado){
        return lado * 4;
    }
}
