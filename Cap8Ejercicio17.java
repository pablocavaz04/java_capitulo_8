/**
 * 17 Escribe un programa que pase de binario a decimal.
 * 
 * Author:Pablo Camino Vázquez
 */

import java.util.Scanner;
import mates.general.*;

public class Cap8Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número binario: ");
        int binario= sc.nextInt();
        
        System.out.print("El número " + binario + " en decimal es: " + varias.aDecimal(binario));

        sc.close();
    }
}