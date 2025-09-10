package Ian.poo.tp1.ejer9;

public class Circunferencia extends Figura {
    double radio;
    public Circunferencia(double radio, String colorfondo, String colorborde) {
        super(0, 0, colorfondo, colorborde);
        this.radio=radio;
    }

    @Override
    public String toString() {
        return "";
    }
    
}
