class Tema implements Comparable<Tema>{
    private String titulo;
    private int prior;

    public Tema(String titulo, int prior){
        this.titulo = titulo;
        this.prior = prior;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getPrior(){
        return prior;
    }
    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo);
    }
    @Override
    public String toString(){
        return "📚 " + titulo + " (Prioridad: " + prior+ ")";
    }
}
