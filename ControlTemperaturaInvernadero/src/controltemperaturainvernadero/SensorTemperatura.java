/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltemperaturainvernadero;

/**
 *
 * @author SENA
 */
class SensorTemperatura {
    private double temperatura;

    public SensorTemperatura(double temperaturaInicial) {
        this.temperatura = temperaturaInicial;
    }

    public double leerTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
