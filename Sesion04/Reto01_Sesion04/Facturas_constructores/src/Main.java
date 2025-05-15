public class Main {
    public static void main(String[] args){
        Factura f1 = new Factura("FCT1205", "Ilse Rueda", 2050);
        Factura f2 = new Factura("FCT1302", "Gerardo Bautista", 3600);

        System.out.println(f1);
        System.out.println(f2);

        //EQUALS
        System.out.println("¿Son iguales?: " + f1.equals(f2));
    }
}
