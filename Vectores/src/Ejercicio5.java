
import java.util.Scanner;



public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        int goles[][]= new int[5][3];
        double prom[]= new double[5];
        double promedio= 0;
        for (int i = 0; i <5; i++) {
            double total=0;
            System.out.println("jugador numero: " + i);
            System.out.println("Ingrese los goles de los ultimos 3 partidos");
            for (int j = 0; j <3; j++) {  
                System.out.println("partido numero: " + j);
                System.out.println("goles: ");
                int gol= consola.nextInt();
                total=total+gol;    
            }
            promedio= total/3;
            prom[i]=promedio;    
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("El promedio del jugador numero: " + i + " es de :" + prom[i] );
        }
    }
    
}
