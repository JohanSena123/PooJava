/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_reservas;

/**
 *
 * @author SENA
 */
public class Usuario extends Persona {
    private int ID_usuario;
    
    public Usuario(String datoNombre,String datoApellido,int datoCedula,int datoID_usuario){
    super(datoNombre, datoApellido, datoCedula);
    this.ID_usuario=datoID_usuario;
    
    
    public void ImprimirDatos(){
        System.out.println(this.ID_usuario);
    }
    
    
}
