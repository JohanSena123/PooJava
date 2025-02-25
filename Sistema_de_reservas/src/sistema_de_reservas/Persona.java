/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_reservas;

/**
 *
 * @author SENA
 */
public class Persona {
    private static String Nombre;
    private static String Apellido;
    private int Cedula;
    
    public Persona(String datoNombre,String datoApellido,int datoCedula){
    Persona.Nombre=datoNombre;
    Persona.Apellido=datoApellido;
    this.Cedula=datoCedula;
    }
 
    public String getNombre(){
        String auxNombre=Persona.Nombre;
        return auxNombre;
    }
    
    public String getApellido(){
        String auxApellido=Persona.Apellido;
        return auxApellido;
    }
    
    public int getCedula(){
        int auxCedula=this.Cedula;
        return auxCedula;
    }
    public void ImprimirDatos(){
        System.out.println(Persona.Nombre);
        System.out.println(Persona.Apellido);
        System.out.println(this.Cedula);
    }
}   
    
    


