/**
 * 3 siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();
        if(varias.esPrimo(num)){
            System.out.println(num + " es primo, vamos a buscar al siguiente");
        } else{
            System.out.println(num + " no es primo, vamos a buscar al siguiente");
        }

        System.out.println("El siguiente número primo es: "+ varias.siguientePrimo(num));
        sc.close();
    }
}