
import java.util.Scanner;



public class ejercicio3 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        int Conjunto[]= new int[15];
        int contar_tres=0;
        for (int i = 0; i <Conjunto.length; i++) {
            System.out.println("carga numero "+ ":" + i );
            int numero= consola.nextInt();
            Conjunto[i]=numero;
            if (numero==3){
               contar_tres=contar_tres+1;
               
            }   
            
        }
        System.out.println("La cantidad de veces que aparecio el 3 es de: " + contar_tres);
    }
}
