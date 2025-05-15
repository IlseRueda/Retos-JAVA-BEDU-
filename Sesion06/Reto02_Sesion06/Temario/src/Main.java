import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static  void main(String[] args){
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();
        temasActivos.add(new Tema("Español", 2));
        temasActivos.add(new Tema("Matemáticas", 1));
        temasActivos.add(new Tema("Civica y Etica", 3));

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Español", "https://recursos.edu/lectura");
        recursos.put("Matemáticas", "https://recursos.edu/mate");
        recursos.put("Civica y Etica", "https://recursos.edu/valores");

        Collections.sort(temasActivos);
        System.out.println("Temas ordenados alfabéticamente: ");
        for (Tema tema : temasActivos) {
            System.out.println(tema);
        }

        temasActivos.sort(Comparator.comparingInt(Tema::getPrior));
        System.out.println("\n Temas ordenados por prioridad: ");
        for (Tema tema : temasActivos) {
            System.out.println(tema);
        }

        System.out.println("\n Recursos compartidos por tema: ");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}
