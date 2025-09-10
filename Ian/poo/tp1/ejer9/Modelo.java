package Ian.poo.tp1.ejer9;
import java.util.ArrayList;
import java.util.List;
public class Modelo {
    public List<Figura> listafiguras;
    public Modelo(){
        this.listafiguras = new ArrayList<>();
    }

    Figura figura;
    public void crearLinea(double largo, String colorfondo, String colorborde){
        figura = new Linea(largo, largo, colorfondo, colorborde);
        listafiguras.add(figura);
        System.out.println("Linea Creada!!");
    }
    public void crearRectangulo(double altura, double largo, String colorfondo, String colorborde){
        figura = new Rectangulo(altura, largo, colorfondo, colorborde);
        listafiguras.add(figura);
    }
    public void crearCircunferencia(double radio, String colorfondo, String colorborde){
        figura = new Circunferencia(radio, colorfondo, colorborde);
        listafiguras.add(figura);
    }
    public void mostrarPizarra(){
        for (Figura figura : listafiguras){
            System.out.println(figura);
        }
    }
}
