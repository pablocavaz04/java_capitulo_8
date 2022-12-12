/**
 * 18 Escribe un programa que pase de decimalo a binario.
 * 
 * Author:Pablo Camino Vázquez
 */

import java.util.Scanner;
import mates.general.*;

public class Cap8Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número decimal: ");
        int numero = sc.nextInt();
        
        System.out.print("El número " + numero + " en binario es: " + varias.aBinario(numero));
        sc.close();
    }
}