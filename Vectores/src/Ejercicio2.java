

import java.util.Scanner;



public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner consola= new Scanner(System.in);
        int Conjunto[]= new int[10];
        System.out.println("Carga de datos enteros:");
        for (int i = 0; i <Conjunto.length; i++) {
            System.out.println("Numero " + i + ":");
            int numero= consola.nextInt();
            Conjunto[i]=numero;
        }
        int maximo=0;
        for (int i = 0; i <Conjunto.length; i++) {
            if (maximo<Conjunto[i]){
                maximo=Conjunto[i];
                
            }
        }
        System.out.println("El valor maximo es:" + maximo);
    }
    
}
