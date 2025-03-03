/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controltienda;

/**
 *
 * @author Johan
 */
public class Main {
    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();
        
        while (true) {
            Cliente cliente = new Cliente();
            
            System.out.println("Membresia: " + cliente.tieneMembresia() + ", Empleado: " + cliente.esEmpleado());
            if (control.permitirAcceso(cliente)) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }
            
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
