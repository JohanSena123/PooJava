/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controltemperaturainvernadero;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SensorTemperatura sensor = new SensorTemperatura(20.0);
        ControladorInvernadero controlador = new ControladorInvernadero(sensor);

        while (true) {
            System.out.print("Ingrese la temperatura actual: ");
            if (scanner.hasNextDouble()) {
                double nuevaTemp = scanner.nextDouble();
                sensor.setTemperatura(nuevaTemp);
                System.out.println("Estado del sistema: " + controlador.verificarEstado());
            } else {
                System.out.println("Entrada invalida.Por favor,ingrese un numero.");
                scanner.next(); // Limpiar el buffer
            }
        }
    }
}