public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada unidad
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Gerardo");
        Patrulla patrulla = new Patrulla("Patrulla", "Lourdes");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Raul");

        // Activar las unidades
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }

}
