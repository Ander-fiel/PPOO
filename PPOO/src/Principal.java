public class Principal {
    public static void main(String[] args) {
        //Instancias de LibroFisico
        LibroFisico libroFisico1 = new LibroFisico("Cien años de soledad", "Gabriel García Márquez", 1967, 471);
        LibroFisico libroFisico2 = new LibroFisico("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 863);
        LibroFisico libroFisico3 = new LibroFisico("Moby Dick", "Herman Melville", 1851, 378);
        LibroFisico libroFisico4 = new LibroFisico("1984", "George Orwell", 1949, 328);
        LibroFisico libroFisico5 = new LibroFisico("Ulises", "James Joyce", 1922, 730);

        //Instancias de LibroElectronico
        LibroElectronico libroElectronico1 = new LibroElectronico("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, "EPUB");
        LibroElectronico libroElectronico2 = new LibroElectronico("Fahrenheit 451", "Ray Bradbury", 1953, "PDF");
        LibroElectronico libroElectronico3 = new LibroElectronico("En busca del tiempo perdido", "Marcel Proust", 1913, "EPUB");
        LibroElectronico libroElectronico4 = new LibroElectronico("La Odisea", "Homero", -800, "PDF");
        LibroElectronico libroElectronico5 = new LibroElectronico("Crimen y castigo", "Fyodor Dostoevsky", 1866, "EPUB");

        //Instancia de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //Se agregan los libros a la biblioteca
        biblioteca.agregarLibro(libroFisico1);
        biblioteca.agregarLibro(libroFisico2);
        biblioteca.agregarLibro(libroFisico3);
        biblioteca.agregarLibro(libroFisico4);
        biblioteca.agregarLibro(libroFisico5);
        biblioteca.agregarLibro(libroElectronico1);
        biblioteca.agregarLibro(libroElectronico2);
        biblioteca.agregarLibro(libroElectronico3);
        biblioteca.agregarLibro(libroElectronico4);
        biblioteca.agregarLibro(libroElectronico5);

        // Imprimir la información de todos los libros en la biblioteca
        biblioteca.imprimirLibros();
    }
}



