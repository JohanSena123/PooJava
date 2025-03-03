/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces;

/**
 *
 * @author Johan
 */
class ControlLuces {
    private SensorMovimiento sensor;
    private boolean esDeNoche;
    private boolean lucesEncendidas;
    
    public ControlLuces() {
        sensor = new SensorMovimiento();
        esDeNoche = false;
        lucesEncendidas = false;
    }
    
    public void setEsDeNoche(boolean estado) {
        esDeNoche = estado;
    }
    
    public void verificarLuces() {
        sensor.actualizarEstado();
        
        if (esDeNoche && sensor.hayMovimiento()) {
            lucesEncendidas = true;
        } else {
            lucesEncendidas = false;
        }
    }
    
    public boolean estanLucesEncendidas() {
        return lucesEncendidas;
    }
}