public abstract class MetPago implements Autent {
    protected double monto;

    public MetPago(double monto){
        this.monto = monto;
    }

    public abstract void procPago();
    public void mostRes(){
        System.out.println("Tipo: " + getClass().getSimpleName() + "|Monto: $" + monto);
    }
}
