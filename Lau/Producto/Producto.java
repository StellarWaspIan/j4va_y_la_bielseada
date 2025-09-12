package Producto;
/*
Crear clase llamada producto
nombre(String)
precio(double)
cantidad en stock(int)
Crear constructor
implementar set y get
metodos

venderProductor(int cantidad)
aumentarStock(int cantidad)
masStock(producto p)

 */
public class Producto {
    private String nombre;
    private Double precio;
    private int cantidadStock;
    public Producto(String nombre,double precio, int cantidadStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock; 
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setprecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setcantidadStock(int cantidadStock){
        this.cantidadStock = cantidadStock;
    }
    public double venderProductor(){
        return this.precio; 
    }
    public int aumentarStock(){
        return this.cantidadStock ;
    }
    public int masStock(){
        return this.cantidadStock + this.aumentarStock(); 
    }
    
    public boolean venderProducto(){
        if (this.cantidadStock < 10) {
            return true;
        }else{
            return false; 
        }
    }
    public int getcantidadStock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getcantidadStock'");
    }

}
