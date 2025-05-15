import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class AnalisisLogs {
    public static void main(String[] args){
        String rutaArchLog = "errores.log";
        String rutaArchErr = "registro_fallos.txt";
        analizarLog(rutaArchLog, rutaArchErr);
    }
    public static void  analizarLog(String arcLog, String archError){
        int tLineas = 0;
        int errores = 0;
        int advertencias = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(arcLog))) {
            String linea;
            while ((linea = br.readLine())!= null){
                tLineas++;
                if (linea.contains("Error")){
                    errores++;
                }if (linea.contains("Alerta")){
                    advertencias++;
                }
            }
        double perErrorAdv = (double) (errores + advertencias) / tLineas * 100;
            System.out.println("📊 Resumen del análisis:");
            System.out.println("🔢 Total de líneas leídas: " + tLineas);
            System.out.println("❌ Cantidad de errores: " + errores);
            System.out.println("⚠️ Cantidad de advertencias: " + advertencias);
            System.out.printf("📈 Porcentaje de líneas con errores/advertencias: %.2f%%\n", perErrorAdv);
        }catch (IOException e){
            System.out.println("❌Error al leer el archivo, se registrara en: " + archError);
            regFallo(archError, e.getMessage());
        }
    }
    public  static void regFallo(String arcErr, String msjError){
        try {
            Files.write(Paths.get(arcErr), msjError.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println(" No se pudo registrar el fallo: " + e.getMessage());
        }
    }
}
