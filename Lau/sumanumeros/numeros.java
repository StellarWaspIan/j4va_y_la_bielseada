package sumanumeros;

import java.util.Scanner;

public class numeros {
    private int num1; 
    private int num2;
    public numeros(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void setnum1(int n){
        this.num1 = n;
    }
    public int getnum1(){
        return this.num1;
    }
    public void setnum2(int n){
        this.num2 = n;
    }
    public int getnum2(){
        return this.num2;
    }
    public static int sumarNumeros(int n1, int n2){
        System.out.print("Ingrese el primer número: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        return suma;
    }
    
}
