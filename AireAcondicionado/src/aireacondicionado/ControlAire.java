/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado;

/**
 *
 * @author Johan
 */
class ControlAire {
    private SensorAmbiente sensor;
    private boolean aireEncendido;
    
    public ControlAire() {
        sensor = new SensorAmbiente();
        aireEncendido = false;
    }
    
    public void verificarAire() {
        sensor.actualizarEstado();
        int temp = sensor.getTemperatura();
        int hum = sensor.getHumedad();
        
        if ((temp > 28 && hum > 60) || temp > 30) {
            aireEncendido = true;
        } else {
            aireEncendido = false;
        }
    }
    
    public boolean estaEncendido() {
        return aireEncendido;
    }
    
    public int getTemperatura() {
        return sensor.getTemperatura();
    }
    
    public int getHumedad() {
        return sensor.getHumedad();
    }
}
