// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
public class Main {
    public static void main(String[] args) {
        ListaAeropuerto listaAeropuerto = new ListaAeropuerto();
        listaAeropuerto.listA();
        ListaVuelos listaVuelos = new ListaVuelos();
        listaVuelos.listV();
        Menu.menu(listaAeropuerto, listaVuelos);
    }
}