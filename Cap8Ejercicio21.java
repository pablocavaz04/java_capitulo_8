/**
 * 21 minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 
 * Author:Pablo Camino Vázquez
 */

import java.util.Scanner;
import mates.general.*;

public class Cap8Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el tamaño del array: ");
        int n = sc.nextInt();
        System.out.print("Dime el mínimo del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo del intervalo: ");
        int max = sc.nextInt();

        int[] num = arrays.generaArrayInt(n, min, max);

        arrays.escribeArray(num);

        System.out.print("El mínimo de ese array es: " + arrays.minimoArrayInt(num));

        sc.close();
    }
}