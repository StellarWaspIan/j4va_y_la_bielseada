package Ian.poo.tp1.ejer9;

public class Circunferencia extends Figura {
    static double radio;
    public Circunferencia(double altura, double largo, double radio, String colorfondo, String colorborde) {
        super(altura, largo, colorfondo, colorborde);
        Circunferencia.radio=radio;
    }

    @Override
    public String toString() {
        return "";
    }
    
}
