/**
 * 11 pegaPorDetras: Añade un dígito a un número por detrás.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime el número a añadir: ");
        int num2 = sc.nextInt();

        System.out.println("El número " + num + " con el añadido sería: " + varias.pegaPorDetras(num, num2));
        sc.close();
    }
}