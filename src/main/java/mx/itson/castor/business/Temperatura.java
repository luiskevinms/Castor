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
     * Este método sirve para convertir de grados centigrados a farenheit
     * @param centigrados
     * @return 
     */
    public double convertirGrados(double centigrados){
        return centigrados * (9/5) + 32;
    }
}
