package Ian.poo.tp1.ejer9;
import java.util.ArrayList;
import java.util.List;
public class Modelo {
    //Esta seria la pizarra
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
        figura = new Rectangulo(altura, largo, colorfondo, colorborde, 0);
        listafiguras.add(figura);
        System.out.println("Rectangulo Creado!!");
    }
    public void crearCircunferencia(double radio, String colorfondo, String colorborde){
        figura = new Circunferencia(radio, colorfondo, colorborde);
        listafiguras.add(figura);
    }
    public void limpiarPizarra(){
        listafiguras.clear();
        System.out.println("Pizarra limpia!!");
    }
    public void mostrarPizarra(){
        for (Figura figura : listafiguras){
            System.out.println(figura);
        }
    }
    public void calcularSuperficie(){
        for (Figura figura : listafiguras){
            if (figura instanceof Linea){
                System.out.println(figura+", Superficie: 0");
            } 
            else if (figura instanceof Rectangulo) {
                double superficie = 2*(figura.altura+figura.largo);
                System.out.println(figura+", Superficie: "+superficie);
            } 
            else if (figura instanceof Circunferencia){
                double superficie = figura.pi*(figura.radio*figura.radio);
                System.out.println(figura+", Superficie: "+superficie);       
            }
        }
    }
    public void calcularPerimetro(){
        for (Figura figura : listafiguras){
            if (figura instanceof Linea){
                System.out.println(figura+", Perimetro: 0");
            } 
            else if (figura instanceof Rectangulo) {
                double perimetro = (2*figura.altura)+(2*figura.largo);
                System.out.println(figura+", Perimetro: "+perimetro);
            } 
            else if (figura instanceof Circunferencia){
                double perimetro = figura.pi*figura.radio*2;
                System.out.println(figura+", Perimetro: "+perimetro);       
            }
        }
    }
}
