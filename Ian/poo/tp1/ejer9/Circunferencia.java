package Ian.poo.tp1.ejer9;

public class Circunferencia extends Figura {
    public Circunferencia(double radio, String colorfondo, String colorborde) {
        super(0, 0, colorfondo, colorborde, radio);
    }

    @Override
    public String toString() {
        return "|Circunferencia| Radio: "+radio+", Color de Fondo: "+colorfondo+", Color de Borde: "+colorborde;
    }
    
}
