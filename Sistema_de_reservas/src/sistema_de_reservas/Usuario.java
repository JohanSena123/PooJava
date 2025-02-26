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
    boolean[] asientos;
    
    public Usuario(String datoNombre,String datoApellido,int datoCedula,int datoID_usuario){
    super(datoNombre, datoApellido, datoCedula);
    this.ID_usuario=datoID_usuario;
    asientos = new boolean[10];
    }
    public void ReservarAsiento(int numAsiento) {
        if (numAsiento >= 0 && numAsiento < asientos.length) {
            if (asientos[numAsiento] == false) {
                asientos[numAsiento] = true;
                System.out.println("Asiento " + numAsiento + " reservado.");
            } else {
                System.out.println("Asiento no disponible.");
            }
        } else {
            System.out.println("Numero de asiento invalido.");
        }
    }
    
    public void MostrarAsientos() {
        System.out.println("Estado de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == false) {
                System.out.println("Asiento " + i + ":disponible");
            } else {
                System.out.println("Asiento " + i + ":ocupado");
            }
        }
    }
      public void ImprimirDatos() {
        System.out.println("Nombre:" + getNombre());
        System.out.println("Apellido:" + getApellido());
        System.out.println("Cédula:" + getCedula());
        System.out.println("ID de Usuario:" + ID_usuario);
        System.out.print("Asientos reservados:");
        boolean tieneReservas = false;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i]) {
                System.out.print(i + " ");
                tieneReservas = true;
            }
        }
        if (!tieneReservas) {
            System.out.print("Ninguno");
        }
        System.out.println();
    }
}


