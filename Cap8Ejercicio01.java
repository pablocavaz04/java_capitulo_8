/**
 * 1 esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;
import java.util.Scanner;

public class Cap8Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int num = sc.nextInt();

        if(varias.esCapicuo(num)){
            System.out.println("Es capicúo");
        } else{
            System.out.println("No es capicúo");
        }
        sc.close();
    }
}