package sumanumeros;

import java.util.Scanner;

public class main {

    // Método que pide dos números al usuario y devuelve la suma
    public static int sumarNumeros() {
        int num1 = 0;
        int num2 = 0;
        int suma = num1 + num2;
        return suma;
    }
    public static void main(String[] args) {

        System.out.print("Ingrese el primer número: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = sumarNumeros();
        System.out.println("La suma es: " + resultado);
        scanner.close();
    }
        
}


