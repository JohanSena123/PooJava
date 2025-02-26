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
    private  String Nombre;
    private  String Apellido;
    private int Cedula;
    
    public Persona(String datoNombre,String datoApellido,int datoCedula){
    this.Nombre=datoNombre;
    this.Apellido=datoApellido;
    this.Cedula=datoCedula;
    }
 public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCedula() {
        return Cedula;
    }
    
    
}   
    
    


