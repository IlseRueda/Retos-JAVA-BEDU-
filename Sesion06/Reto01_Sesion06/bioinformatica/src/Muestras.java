import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class Muestras {
    public static void main(String[] args){
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");

        HashSet<String>espUni = new HashSet<>(listaMuestras);
        HashMap<String, String> idMuestraInv = new HashMap<>();
        idMuestraInv.put("M-1205", "Dra. Rueda");
        idMuestraInv.put("M-1302", "Dr. Bautista");
        idMuestraInv.put("M-0809", "Dra. Hernandez");

        System.out.println("Orden de muestras: ");
        for (String muestra: listaMuestras){
            System.out.println("-" + muestra);
        }
        System.out.println("Especies unicas: ");
        for (String especie : espUni){
            System.out.println("-" + especie);
        }
        System.out.println("Relacion ID de muestra || Investigador: ");
        for (String id: idMuestraInv.keySet()){
            System.out.println(id + "||" + idMuestraInv.get(id));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un ID para buscar: ");
        String idBusc = scanner.nextLine();
        if(idMuestraInv.containsKey(idBusc)){
            System.out.println("Resultado: " + idBusc + "pertenece a: " + idMuestraInv.get(idBusc));
        }else {
            System.out.println("No se encontraron muestras con el ID: " + idBusc);
        }
        scanner.close();
    }
}
