
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;


public class principal {
    public static void main(String[] args) {
        int numero= 33930; int unidad; int mayor; int contar; int posicion=0;
        
        List<Integer> lista_numero = new ArrayList<Integer>();
        List<Integer> lista_final = new ArrayList<Integer>();
        
        while (numero >10){
            unidad= numero % 10;
            numero= numero / 10;
            lista_numero.add(unidad);
        }
        unidad= numero % 10;
        lista_numero.add(unidad);
        
        contar=lista_numero.size();
        while(contar!=0){
            mayor=0;
            for (int i = 0; i < lista_numero.size(); i++) {
                if (lista_numero.get(i)>mayor) {
                    mayor=lista_numero.get(i);
                    posicion=lista_numero.indexOf(i);
                }
            }
            lista_final.add(mayor);
            lista_numero.remove(posicion);
            contar--;
        }
        
        System.out.println(lista_final);
  
    }
}
