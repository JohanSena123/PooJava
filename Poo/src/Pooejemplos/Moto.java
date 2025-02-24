/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooejemplos;

/**
 *
 * @author SENA
 */
public class Moto extends Vehiculo{
    private int cantidadCauchos;
    
    public Moto(String datoPlaca, String datoModelo, String datoColor, int datoCauchos){
    super (datoPlaca, datoModelo, datoColor);
    this.cantidadCauchos=datoCauchos;
    }
    
    public int getCantidadCauchos(){
    return this.cantidadCauchos;
    }
    
    public void setCantidadCauchos(int datoCantidad){
    this.cantidadCauchos=datoCantidad;
    }
    
    public void imprimirDatos(){
    super.ImprimirDatos();
        System.out.println("Color es: "+super.getColor());
        System.out.println("Cantidad de Cauchos es"+this.cantidadCauchos);
    }
}
