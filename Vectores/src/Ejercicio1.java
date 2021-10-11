
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        
        String palabra[]= new String[7];
        for (int i=0; i <palabra.length  ; i++){
            System.out.println("Ingrese un nombre:");
            String nombre= consola.nextLine();
            palabra[i]=nombre;
        }
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("nombre " +i + ": " + palabra[i] );
        }
            
    }
}
