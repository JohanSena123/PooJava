/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltienda;

/**
 *
 * @author Johan
 */
import java.util.Random;

class Cliente {
    private boolean tieneMembresia;
    private boolean esEmpleado;
    
    public Cliente() {
        Random rand = new Random();
        tieneMembresia = rand.nextBoolean();
        esEmpleado = rand.nextBoolean();
    }
    
    public boolean tieneMembresia() {
        return tieneMembresia;
    }
    
    public boolean esEmpleado() {
        return esEmpleado;
    }
}
