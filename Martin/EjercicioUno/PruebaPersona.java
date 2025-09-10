import java.util.Scanner;

public class PruebaPersona{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese los datos de la Primera Persona");
        System.out.print("Nombre: ");
        String nombre1 = scan.nextLine();
        System.out.print("Apellido: ");
        String apellido1 = scan.nextLine();
        System.out.print("Edad: ");
        int edad1 = scan.nextInt();
        System.out.print("DNI: ");
        int dni1 = scan.nextInt();
        System.out.print("Peso(kg): ");
        double peso1 = scan.nextDouble();
        System.out.print("Altura(m): ");
        double altura1 = scan.nextDouble();
        System.out.print("Sexo(F/M): ");
        char sexo1 = scan.next().charAt(0);
        scan.nextLine();

        Persona p1 = new Persona(nombre1,apellido1,edad1,dni1,peso1,altura1,sexo1);

        System.out.println("Ingrese los datos de la Segunda Persona");
        System.out.print("Nombre: ");
        String nombre2 = scan.nextLine();
        System.out.print("Apellido: ");
        String apellido2 = scan.nextLine();
        System.out.print("Edad: ");
        int edad2 = scan.nextInt();
        System.out.print("DNI: ");
        int dni2 = scan.nextInt();
        System.out.print("Peso(kg): ");
        double peso2 = scan.nextDouble();
        System.out.print("Altura(m): ");
        double altura2 = scan.nextDouble();
        System.out.print("Sexo(F/M): ");
        char sexo2 = scan.next().charAt(0);
        scan.nextLine();

        Persona p2 = new Persona(nombre2,apellido2,edad2,dni2,peso2,altura2,sexo2);
        
        System.out.println("RESULTADOS");

       if (p1.esMayorDeEdad()){
            System.out.println(p1.getNombre() + " Es mayor de edad ");
       } else {
        System.out.println(p1.getNombre() + " Es menor de edad ");
       }
       if (p2.esMayorDeEdad()) {
            System.out.println(p2.getNombre() + " Es mayor de edad " );
       } else {
          System.out.println(p2.getNombre() + " Es menor de edad ");
       }

       if(p1.esMayorQue(p2)) {
          System.out.println(p1.getNombre() + " Es mayor que " + p2.getNombre());
       } else if(p2.esMayorQue(p1)){
          System.out.println(p2.getNombre() + " Es mayor que " + p1.getNombre());
       } else {
         System.out.println(p1.getNombre() + " y " + p2.getNombre() + " Tienen la misma edad ");
       }

       int imc1 = p1.calcularIMC();
         
       if(imc1==-1) {
         System.out.println(p1.getNombre() + " Esta por debajo de su peso ideal ");
       } else if(imc1==1){
         System.out.println(p1.getNombre() + " Esta en su peso ideal ");
       } else {
         System.out.println(p1.getNombre() + " Tiene Sobrepeso ");
       }

       int imc2 = p2.calcularIMC();
       if(imc2==-1) {
         System.out.println(p2.getNombre() + " Esta por debajo de su peso ideal ");
       } else if(imc2==1) {
         System.out.println(p2.getNombre() + " Esta en su peso ideal ");
       } else {
         System.out.println(p2.getNombre() + " Tiene Sobrepeso ");
       }

       System.out.println(" Datos de la Primera Pesona " + p1);
       System.out.println(" Datos de la Segunda Persona " + p2);

       scan.close();
    }
}