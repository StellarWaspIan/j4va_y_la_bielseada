package Ian.poo.tp1.ejer9;

public abstract class Figura{
    static double altura=0;
    static double largo=0;
    static String colorfondo="";
    static String colorborde="";
    
    public Figura(double altura, double largo, String colorfondo, String colorborde) {
        Figura.altura = altura;
        Figura.largo = largo;
        Figura.colorfondo = colorfondo;
        Figura.colorborde = colorborde;
    }

    final double pi=3.14;

    public abstract String toString();
}