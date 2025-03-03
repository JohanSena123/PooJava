/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado;

/**
 *
 * @author Johan
 */
import java.util.Random;

class SensorAmbiente {
    private int temperatura;
    private int humedad;
    
    public SensorAmbiente() {
        temperatura = 25;
        humedad = 50;
    }
    
    public void actualizarEstado() {
        Random rand = new Random();
        temperatura = 25 + rand.nextInt(10); 
        humedad = 50 + rand.nextInt(51); 
    }
    
    public int getTemperatura() {
        return temperatura;
    }
    
    public int getHumedad() {
        return humedad;
    }
}