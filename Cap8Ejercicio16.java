/**
 * 16 Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * Author:Pablo Camino Vázquez
 */

import mates.general.*;

public class Cap8Ejercicio16 {
    public static void main(String[] args) {
        for(int i = 1; i<1000 ;i++){
            if(varias.esCapicuo(i)){
                System.out.println(i);
            }
        }
    }
}