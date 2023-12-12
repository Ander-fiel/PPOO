import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    private static final String LINEA_DE_GUIONES = "-----------------------------------------------------------------------------------------------------------------------------";

    public void imprimirLibros() {
        System.out.println(LINEA_DE_GUIONES);
        System.out.println("Libros físicos:");
        for (Libro libro : libros) {
            if (libro.esLibroFisico()) {
                libro.imprimirInfo();
                System.out.println();
            }
        }

        System.out.println(LINEA_DE_GUIONES);
        System.out.println("Libros electrónicos:");
        for (Libro libro : libros) {
            if (libro.esLibroElectronico()) {
                libro.imprimirInfo();
                System.out.println();
            }
        }
        System.out.println(LINEA_DE_GUIONES);
    }
}



