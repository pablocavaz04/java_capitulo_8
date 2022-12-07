/**
 * 12 pegaPorDelante: Añade un dígito a un número por delante.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime el número a añadir: ");
        int num2 = sc.nextInt();

        System.out.println("El número " + num + " con el añadido sería: " + varias.pegaPorDelante(num, num2));
        sc.close();
    }
}