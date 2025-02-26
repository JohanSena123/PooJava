/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_reservas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su Nombre:");
        String Nombre = scanner.nextLine();
        
        System.out.println("Ingrese su Apellido:");
        String Apellido = scanner.nextLine();
        
        System.out.println("Ingrese su Cedula:");
        int Cedula = scanner.nextInt();
        
        Usuario objusuario = new Usuario(Nombre, Apellido, Cedula, 20109212);
        objusuario.ImprimirDatos();
        
      int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menu");
            System.out.println("Escoja una opcion:");
            System.out.println("1.Ver asientos");
            System.out.println("2.Reservar");
            System.out.println("3.Imprimir");
            System.out.println("4.Salir");
            opcion = scanner.nextInt();
            
            if (opcion == 1) {
                objusuario.MostrarAsientos();
            } else if (opcion == 2) {
                System.out.print("Ingrese un asiento para reservarlo:");
                int numAsiento = scanner.nextInt();
                objusuario.ReservarAsiento(numAsiento);
            } else if (opcion == 3) {
                objusuario.ImprimirDatos();
            } else if (opcion == 4) {
                System.out.println("Gracias por reservar");
            } else {
                System.out.println("ERROR, intente otra vez");
            }
        }
        
        scanner.close();
    }
}
