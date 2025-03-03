/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sensores;

/**
 *
 * @author Johan
 */
class SistemaSeguridad {
    private Sensor sensor1, sensor2, sensor3;
    private boolean esDeNoche;
    private boolean alarmaActivada;
    
    public SistemaSeguridad() {
        sensor1 = new Sensor();
        sensor2 = new Sensor();
        sensor3 = new Sensor();
        esDeNoche = false;
        alarmaActivada = false;
    }
    
    public void setEsDeNoche(boolean estado) {
        esDeNoche = estado;
    }
    
    public void verificarSensores() {
        sensor1.actualizarEstado();
        sensor2.actualizarEstado();
        sensor3.actualizarEstado();
        
        int detecciones = 0;
        if (sensor1.getEstado()) detecciones++;
        if (sensor2.getEstado()) detecciones++;
        if (sensor3.getEstado()) detecciones++;
        
        if (esDeNoche && detecciones >= 2) {
            alarmaActivada = true;
        } else {
            alarmaActivada = false;
        }
    }
    
    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
}