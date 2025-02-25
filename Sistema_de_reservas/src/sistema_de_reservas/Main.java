/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_reservas;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner TomarDatos= new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        String Nombre =TomarDatos.nextLine();
        
        System.out.println("Ingrese su Apellido: ");
        String Apellido=TomarDatos.nextLine();
        
        System.out.println("Ingrese su Cedula: ");
        int Cedula=TomarDatos.nextInt();
        
        Persona objPersona= new Persona(Nombre,Apellido,Cedula);
        Usuario objUsuario= new Usuario(Nombre,Apellido,Cedula,20109212);
        
        objPersona.ImprimirDatos();
        
        
       
    
        
    }
    
}
