package Producto;

import java.util.Scanner;

public class Main{
  
   
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String nombre; 
        System.out.println("Ingrese el nombre del producto");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el valor del precio");
        double precio;
        precio = scanner.nextDouble();
        System.out.println("ingrese la cantidad del stock");
        int cantidadStock;
        cantidadStock = scanner.nextInt();
        Producto pro1 = new Producto(nombre, precio, cantidadStock);
        System.out.println("¿Cuántos productos desea vender?");
        int cantidadVender = scanner.nextInt();
        System.out.println("Aumentara el stock");
        int aumentarStock = scanner.nextInt();
        System.out.println(pro1.aumentarStock());
        System.out.println("se vendera parte del producto");
        cantidadStock = scanner.nextInt();
        pro1.setcantidadStock(cantidadStock);
        System.out.println(pro1.venderProductor());
        pro1.venderProductor();
        System.out.println("ahora se trae mas stock");
  
        System.out.println(pro1.masStock());
        System.out.println("Ingrese el nombre del segundo producto:");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese el precio:");
        double precio2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("ingrese el stock.");
        int cantidadStock2 = 0;
        cantidadStock = scanner.nextInt();
        Producto pro2 = new Producto(nombre2, precio2, cantidadStock2);
        System.out.println("ingrese 10 unidades mas del producto numero dos: ");
        cantidadStock = scanner.nextInt();
        System.out.println(pro1.venderProducto());
   
        pro1.venderProducto();
        System.out.println("el producto 2 es mayor que el primero en stock");
        System.out.println(pro2.venderProducto());
        pro2.venderProducto();
        scanner.close();  
    }



}
