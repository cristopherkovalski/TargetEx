/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package target;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Inverte {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite uma string: ");
    String str = entrada.nextLine();
    entrada.close();

    String strInvertida = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      strInvertida += str.charAt(i);
    }

    System.out.println("String invertida: " + strInvertida);
  }

}
    

