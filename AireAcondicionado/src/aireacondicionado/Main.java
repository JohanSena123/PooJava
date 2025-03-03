/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aireacondicionado;

/**
 *
 * @author Johan
 */
public class Main {
    public static void main(String[] args) {
        ControlAire control = new ControlAire();
        
        while (true) {
            control.verificarAire();
            
            System.out.println("Temp: " + control.getTemperatura() + "C, Hum: " + control.getHumedad() + "%");
            if (control.estaEncendido()) {
                System.out.println("El aire esta prendido");
            } else {
                System.out.println("El aire esta apagado");
            }
            
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
