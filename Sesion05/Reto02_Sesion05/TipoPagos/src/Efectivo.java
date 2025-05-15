public class Efectivo extends MetPago {
    public Efectivo(double monto){
        super(monto);
    }
    @Override
    public boolean autenticar(){
        return true;
    }
    @Override
    public void procPago(){
        System.out.println("Procesando pago en efectivo de: $" + monto);
    }
}
