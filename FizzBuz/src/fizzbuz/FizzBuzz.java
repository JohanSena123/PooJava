/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuz;

/**
 *
 * @author SENA
 */
class FizzBuzz {
    public String evaluarNumero(int numero){
        if (numero%3==0&&numero%5== 0){
            return "FizzBuzz";
        }else if (numero%3==0){
            return "Fizz";
        } else if (numero%5==0){
            return "Buzz";
        } else{
            return String.valueOf(numero);
        }
    }
}
