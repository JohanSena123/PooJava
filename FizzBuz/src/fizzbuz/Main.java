/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuz;

/**
 *
 * @author SENA
 */
public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        for (int i=1;i<=100;i++){
            System.out.println(fizzBuzz.evaluarNumero(i));
        }
    }
}

