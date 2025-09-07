package Ian.poo.tp1.ejer9;
import java.util.ArrayList;
public class Modelo {
    ArrayList <Figura> listafiguras = new ArrayList<Figura>();
    Circunferencia figura;
    public void crearFigura(){
        figura = new Circunferencia(0, 0, 0, null, null);
    }
}
