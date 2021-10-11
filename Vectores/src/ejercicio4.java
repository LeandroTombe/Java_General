


import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
    Scanner consola= new Scanner(System.in);
    int Sueldos[]= new int[12];
    System.out.println("Ingrese el nombre del empleado:");
    String Empleado= consola.nextLine();
    
    int total=0;
    double promedio= 0;
    
    for (int i = 0; i <Sueldos.length; i++) {
        System.out.println("Sueldo del mes "+ i + ":");
        int numero= consola.nextInt();
        Sueldos[i]=numero;
        total=total+numero;
        
            
            
        }
    promedio= total/12;
        System.out.println("Nombre:" + " " + Empleado);
        System.out.println("La suma total de los sueldos es de:" + ' ' + total);
        System.out.println("promedio es de:" + " " + promedio);
    }
    
}
