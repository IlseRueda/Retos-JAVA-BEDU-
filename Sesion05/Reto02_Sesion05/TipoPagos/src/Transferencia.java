public class Transferencia extends MetPago {
    private boolean valBanco;
    public Transferencia(double monto, boolean valBanco){
        super(monto);
        this.valBanco = valBanco;
    }

    @Override
    public boolean autenticar(){
        return valBanco;
    }
    @Override
    public void procPago(){
        System.out.println("Procesando pago por transferencia de: $" + monto);
    }
}
