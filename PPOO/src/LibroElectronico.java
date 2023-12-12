public class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String autor, int anioPublicacion, String formato) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Formato: " + formato);
    }

    @Override
    public boolean esLibroElectronico() {
        return true;
    }
}