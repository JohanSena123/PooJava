/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pooejemplos;

/**
 *
 * @author SENA
 */
//Polimorfismo
public class Poo {
    
    public static void main(String[] args) {
      Vehiculo objTaxi = new Vehiculo("ED009FA", "2006", "Azul");
      objTaxi.ImprimirDatos();//Aqui se esta usando el polimorfismo 
      String auxColor = objTaxi.getColor();
      System.out.println("El color es: "+auxColor);
        
      Vehiculo objBus = new Vehiculo("SDEF43","2010","Rojo");
      objBus.ImprimirDatos();//Aqui se esta usando el polimorfismo
      String auxColor2 = objBus.getColor();
      System.out.println("El color es: "+auxColor2);
    }
    
}
