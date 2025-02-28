/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltemperaturainvernadero;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
class ControladorInvernadero {
    private SensorTemperatura sensor;

    public ControladorInvernadero(SensorTemperatura sensor) {
        this.sensor = sensor;
    }

    public String verificarEstado() {
        double temperatura = sensor.leerTemperatura();
        if (temperatura < 10) {
            return "Calefactor Activado";
        } else if (temperatura > 25) {
            return "Ventilador Activado";
        } else {
            return "Sistema Inactivo";
        }
    }
}