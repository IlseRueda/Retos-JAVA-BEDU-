public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("GEBG1302", 10500.00);
        CuentaFiscal cuenta = new CuentaFiscal("GEBG1302", 15000.00);

        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean esValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido?: " + esValido);
    }
}