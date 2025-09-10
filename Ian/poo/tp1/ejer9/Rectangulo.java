package Ian.poo.tp1.ejer9;

public class Rectangulo extends Figura {
    public Rectangulo(double altura, double largo, String colorfondo, String colorborde, double radio){
        super(altura, largo, colorfondo, colorborde, 0);
    }
    @Override
    public String toString() {
        return "|Rectangulo| Largo: "+largo+", Alto: "+altura+", Color de Fondo: "+colorfondo+", Color de Borde: "+colorborde;
    }
}
