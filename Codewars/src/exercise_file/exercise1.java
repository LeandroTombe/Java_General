
package exercise_file;

import java.io.File;


public class exercise1 {
    
    public static void main(String[] args) {
        
        File archivo= new File("test");
        
        System.out.println(archivo.getAbsolutePath());
        
        System.out.println(archivo.exists());
    }
    
}
