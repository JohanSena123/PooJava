/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces;

/**
 *
 * @author Johan
 */
import java.util.Random;

class SensorMovimiento {
    private boolean movimiento;
    
    public SensorMovimiento() {
        movimiento = false;
    }
    
    public void actualizarEstado() {
        Random rand = new Random();
        movimiento = rand.nextBoolean();
    }
    
    public boolean hayMovimiento() {
        return movimiento;
    }
}