/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasimple;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
class Operaciones {
    private Calculadora calculadora;
    private Scanner scanner;

    public Operaciones() {
        calculadora = new Calculadora();
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Elija operación (suma, resta, multiplicacion, division) o 'salir': ");
            String operacion = scanner.next().toLowerCase();
            
            double resultado = 0;
            switch (operacion) {
                case "suma":
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case "resta":
                    resultado = calculadora.restar(num1, num2);
                    break;
                case "multiplicacion":
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case "division":
                    resultado = calculadora.dividir(num1, num2);
                    break;
                case "salir":
                    continuar = false;
                    System.out.println("Saliendo de la calculadora...");
                    continue;
                default:
                    System.out.println("Operación no válida, intente de nuevo.");
                    continue;
            }
            
            System.out.println("El resultado es: " + resultado);
        }
    }
}
