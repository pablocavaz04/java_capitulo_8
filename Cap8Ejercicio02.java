/**
 * 2 esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();

        if(varias.esPrimo(num)){
            System.out.println(num + " es primo");
        } else{
            System.out.println(num + " no es primo");
        }
        sc.close();
    }
}