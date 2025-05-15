import java.nio.file.*;
import java.io.IOException;
public class RegistroSim {
    public static void main(String[] args){
        String directorio = "config";
        String archivo = "config/parametros.txt";
        guardarParam(directorio, archivo);
        if(Files.exists(Paths.get(archivo))){
            System.out.println("Archivo creado exitosamente");
            leerParam(archivo);
        }else {
            System.out.println("No existe el archivo");
        }
    }
    public static void guardarParam(String directorio, String archivo){
        try {
            Files.createDirectories(Paths.get(directorio));
            String contenido = """
                Tiempo de ciclo: 60.8 segundos
                Velocidad de línea: 1.5 m/s
                Número de estaciones: 9
            """;

            Files.write(Paths.get(archivo), contenido.getBytes());
            System.out.println("Archivo guardado exitosamente");
        }catch (IOException e){
            System.out.println("No se puede guardar el archivo: " + e.getMessage());
        }
    }
    public static void leerParam(String archivo){
        try {
            String contenido = Files.readString(Paths.get(archivo));
            System.out.println("Contenido del archivo: ");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
