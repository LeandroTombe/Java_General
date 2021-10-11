
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception{
        FileService fileService= new FileTextService();
        
        Path path= Paths.get("src/ordenes.txt");
        
        List<Orden> ordenes=fileService.cargarOrdenes(path);
        
        for (Orden orden :ordenes) {
            System.out.println(ordenes);
        }
        System.out.println(fileService.obtenerCantidadOrdenes(path));
    }
}
