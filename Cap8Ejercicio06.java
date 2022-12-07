/**
 * 6 voltea: Le da la vuelta a un número.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        
        System.out.println("El número volteado es: "+ varias.volteado(num));
        sc.close();
    }
}