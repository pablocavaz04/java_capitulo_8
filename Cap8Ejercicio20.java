/**
 * 20 generaArrayInt: Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 
 * Author:Pablo Camino Vázquez
 */

import java.util.Scanner;
import mates.general.*;

public class Cap8Ejercicio20 {
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

        sc.close();
    }
}