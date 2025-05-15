public class Tarjeta extends MetPago {
    private double saldoDisp;
    public Tarjeta(double monto, double saldoDisp){
        super(monto);
        this.saldoDisp = saldoDisp;
    }

    @Override
    public boolean autenticar(){
        return saldoDisp >= monto;
    }
    @Override
    public void procPago(){
        System.out.println("Procesando pago con tarjeta de: $" + monto);
    }
}
