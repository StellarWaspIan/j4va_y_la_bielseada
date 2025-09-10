package Ian.poo.tp1.ejer9;
public class Controlador {
    private Vista vista;
    private Modelo modelo;
    public Controlador(Vista vista, Modelo modelo){
        this.vista=vista;
        this.modelo=modelo;
    }
    
    public void mostrarMenu(){
        vista.menu();
    }

    public void cargaFigura(int tipo, double altura, double largo, String colorfondo, String colorborde, double radio){
        switch (tipo) {
            case 1:
                modelo.crearLinea(largo, colorfondo, colorborde);
                break;
            case 2:
                modelo.crearRectangulo(altura, largo, colorfondo, colorborde);
                break;
            case 3:
                modelo.crearCircunferencia(radio, colorfondo, colorborde);
                break;
        }
    }
    public void mostrarPizarra(){
        modelo.mostrarPizarra();
    }
}
