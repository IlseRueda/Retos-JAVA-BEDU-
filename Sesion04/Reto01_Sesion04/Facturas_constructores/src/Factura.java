public class Factura {
    private String folio;
    private String cliente;
    private double total;

    //CONSTRUCTOR
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //MET. TOSTRING
   @Override
   public String toString(){
        return "Factura[folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
   }

   //MET.EQUALS
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Factura diferente = (Factura) obj;
        return this.folio.equals(diferente.folio);

    }

    //MET. HASHCODE
    @Override
    public int hashCode(){
        return folio.hashCode();
    }
}
