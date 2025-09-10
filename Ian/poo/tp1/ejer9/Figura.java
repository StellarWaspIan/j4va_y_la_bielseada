package Ian.poo.tp1.ejer9;

public abstract class Figura{
    double altura=0;
    double largo=0;
    String colorfondo="";
    String colorborde="";
    double radio;
    
    public Figura(double altura, double largo, String colorfondo, String colorborde, double radio) {
        this.altura = altura;
        this.largo = largo;
        this.colorfondo = colorfondo;
        this.colorborde = colorborde;
        this.radio=radio;
    }

    public final double pi=3.14;

    public abstract String toString();
}