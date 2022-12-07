/**
 * 9 quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        System.out.print("Dime los dígitos: ");
        int dig = sc.nextInt();
        
        System.out.println("El número sin el número de detrás: " + varias.quitaporDetras(num,dig));
        sc.close();
    }
}