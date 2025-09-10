package Ian.poo.tp1.ejer9;
public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setControlador(controlador);
        controlador.mostrarMenu();
    }
}
