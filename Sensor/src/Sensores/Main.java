/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sensores;
import java.util.Scanner;
/**
 *
 * @author Johan
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaSeguridad sistema = new SistemaSeguridad();
        
        while (true) {
            System.out.println("1.Activar modo noche");
            System.out.println("2.Desactivar modo noche");
            System.out.println("3.Simular sensores");
            System.out.println("4.Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                sistema.setEsDeNoche(true);
                System.out.println("Modo noche activado.");
            } else if (opcion == 2) {
                sistema.setEsDeNoche(false);
                System.out.println("Modo noche desactivado.");
            } else if (opcion == 3) {
                sistema.verificarSensores();
                if (sistema.isAlarmaActivada()) {
                    System.out.println("¡Alarma activada!");
                } else {
                    System.out.println("Todo en calma.");
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion no valida.");
            }
        }
        scanner.close();
    }
}

