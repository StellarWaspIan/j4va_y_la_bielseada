package Ian.poo.tp1.ejer9;

public class Linea extends Figura {

    public Linea(double altura, double largo, String colorfondo, String colorborde) {
        super(0, largo, colorfondo, colorborde, 0);
    }

    @Override
    public String toString() {
        return "|Linea| Largo: "+largo+", Color de Fondo: "+colorfondo+", Color de Borde: "+colorborde;
    }
    
}
