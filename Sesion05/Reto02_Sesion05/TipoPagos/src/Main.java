public class Main {
    public static void main(String[] args){
        MetPago[] pagos = {
                new Efectivo(200.00),
                new Tarjeta(542.00, 560.00),
                new Transferencia(2500.00, false)
        };
        for (MetPago pago:pagos){
            if(pago.autenticar()){
                System.out.println("Autenticacion exitosa");
                pago.procPago();
                pago.mostRes();
            }else {
                System.out.println("Transferencia no valida");
            }
            System.out.println();
        }
    }
}
