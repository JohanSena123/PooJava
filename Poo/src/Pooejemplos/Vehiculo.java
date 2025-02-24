/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooejemplos;

/**
 *
 * @author SENA
 */
//Encapsulamiento es cuando esta publica,privado y protegido
//Abstraccion es cuando agarras objetos de la vida real y lo llevas a codigo
//Polimorfismo es cuando usas los metodos en otra clase
//Herencia es cuando usas los atributos de una clase a otra clase (subclase)
public class Vehiculo {
    private static String Placa;
    private static String Modelo;
    private String Color;
    
    public Vehiculo (String datoPlaca,String DatoModelo,String datoColor){
    Vehiculo.Placa=datoPlaca;
    Vehiculo.Modelo=DatoModelo;
    this.Color=datoColor;
    // cuando es static un atributo para usarlo se debe llamar a la clase seguido del nombre del atributo vehiculo.placa=datoplaca(depende de la calse)
    //cuando no depende de la clase entonces se usa el this para usarla
    }
    
    //Encapsulamiento
    //Metodo Get retorna a quien lo llama y donde hay retorno hay almacenamiento
    public String getColor(){
        String auxColor=this.Color;
        return auxColor;
    }
    //Metodo set se usa para actualizar (debe tener un parametro que llegue de otro lado)
    public void setColor(String datoColor){
        this.Color=datoColor;
    }
    
    public void ImprimirDatos(){
        System.out.println("Placa es: "+Vehiculo.Placa);
        System.out.println("Modelo es: "+Vehiculo.Modelo);
    }
}


