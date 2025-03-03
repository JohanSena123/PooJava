/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlluces;

/**
 *
 * @author Johan
 */
public class Main {
    public static void main(String[] args) {
        ControlLuces control = new ControlLuces();
        control.setEsDeNoche(true);
        
        while (true) {
            control.verificarLuces();
            
            if (control.estanLucesEncendidas()) {
                System.out.println("Las luces estan prendidas");
            } else {
                System.out.println("Las luces estan apagadas");
            }
            
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

