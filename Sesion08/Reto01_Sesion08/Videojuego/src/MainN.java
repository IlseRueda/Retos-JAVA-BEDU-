import java.util.Scanner;
public class MainN {
    private final TransHist transicion;
    private final GestDialg gestor;
    private final LogDecs decision;

    public MainN(TransHist transicion, GestDialg gestor, LogDecs decision){
        this.transicion = transicion;
        this.gestor = gestor;
        this.decision = decision;
    }
    public void iniHist(){
        gestor.mostDial("Bienvenido al reino Magico...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔎 Elige tu camino: [A] Luz | [B] Sombra → ");
        String eleccion = scanner.nextLine();
        scanner.close();

        String resultado = decision.tomarDecs(eleccion);
        gestor.mostDial(resultado);
    }
    public static void main(String[] args){
        MainN juego = new MainN(new TransSmp(), new DialgTxt(), new DescBin());
        juego.iniHist();
    }
}
