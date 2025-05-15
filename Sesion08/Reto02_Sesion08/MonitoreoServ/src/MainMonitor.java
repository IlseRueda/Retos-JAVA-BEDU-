import java.util.HashSet;
import java.util.Scanner;

public class MainMonitor {
    private static final int LIMITE_CRITICO = 90;
    private HashSet<Integer> regCPU = new HashSet<>();
    public void iniMonit(){
        Scanner scanner = new Scanner(System.in);

        try {
            while (true){
                System.out.print("Consumo de CPU (%), o -1 para salir: ");
                String entrada = scanner.nextLine();
                if(!entrada.matches("\\d+")){
                    System.out.println("Error: Ingrese un numero valido: ");
                    continue;
                }
                int consCPU = Integer.parseInt(entrada);
                        if(consCPU == -1)break;
                        if (consCPU < 0 || consCPU > 100){
                            System.out.println("El consumo debe estar entre 0 y 100%");
                            continue;
                        }
                        if (!regCPU.add(consCPU)){
                            System.out.println("Este consumo ya fue registrado");
                            continue;
                        }
                        if (consCPU > LIMITE_CRITICO){
                            throw new CC_Exception("Consumo critico detectado(" + consCPU + "%)." );
                        }
                        System.out.println("Registro aceptado: " + consCPU + "%");
            }
        }catch (CC_Exception e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Monitoreo finalizado");
        }
    }public static void main(String[] args){
        new MainMonitor().iniMonit();
    }
}
