/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package target;
import java.util.Scanner;
/**
 *
 * 
 */
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se pertence a sequência de Fibonacci: ");
        int num = input.nextInt();
        int fib1 = 0, fib2 = 1, fib3;
        boolean pertence = false;

        while (fib1 <= num) {
            if (num == fib1) {
                pertence = true;
                break;
            }
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
    
