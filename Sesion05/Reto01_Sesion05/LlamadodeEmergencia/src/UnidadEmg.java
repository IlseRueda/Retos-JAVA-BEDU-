public abstract class UnidadEmg {

    protected String nombre;
    public UnidadEmg(String nombre) {
            this.nombre = nombre;
        }

        public void activarUnidad() {
            System.out.println("Activando unidad: " + nombre);
        }
        public abstract void responder();
}
