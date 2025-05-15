class Ambulancia extends UnidadEmg {
    private SistGPS gps = new SistGPS();
    private Sirena sirena = new Sirena();
    private Operador operador;

    public Ambulancia(String nombre, String nombreOperador) {
        super(nombre);
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("Ambulancia en camino a hospital.");
    }
}

class Patrulla extends UnidadEmg {
    private SistGPS gps = new SistGPS();
    private Sirena sirena = new Sirena();
    private Operador operador;

    public Patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("Patrulla en situación de seguridad ciudadana.");
    }
}

class UnidadBomberos extends UnidadEmg {
    private SistGPS gps = new SistGPS();
    private Sirena sirena = new Sirena();
    private Operador operador;

    public UnidadBomberos(String nombre, String nombreOperador) {
        super(nombre);
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println(" Unidad de bomberos en emergencia de incendio.");
    }
}