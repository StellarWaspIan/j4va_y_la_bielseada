package Ian.poo.tp1.ejer9;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);
    int opcion;
    public void mostrarMenu(){
        do{
            System.out.println("- - - Pizarra - - -");
            System.out.println("1- Crear Figura");
            System.out.println("2- Eliminar Figura");
            System.out.println("3- Limpiar Pizarra");
            System.out.println("4- Calcular Superficie de Figuras");
            System.out.println("5- Calcular Perimetro de Figuras");
            System.out.println("6- Cambiar color (Borde o Fondo) de Figura");
            System.out.println("7- Cambiar color de fondo de pizarra");
            System.out.println("8- Mostrar Figuras en Pizarra");
            System.out.println("0- Salir");
            opcion=scanner.nextInt();

            switch (opcion) {
                case 1:
                    int figura;
                    do{
                        System.out.println("- - - Creacion de Figura - - -");
                        System.out.println("¿Que figura desea crear? 1-Linea, 2-Rectangulo, 3-Circunferencia");
                        System.out.println("Ingrese una opcion: ");
                        figura = scanner.nextInt();
                        switch (figura) {
                            case 1:
                                System.out.println("- - - Creacion de Linea - - -");
                                System.out.println("Ingrese el largo de la Linea: ");
                                double llargo=scanner.nextDouble();
                                System.out.println("Ingrese el color de fondo de la Linea");
                                String lcolorfondo=scanner.nextLine();
                                System.out.println("Ingrese el color de borde de la Linea");
                                String lcolorborde=scanner.nextLine();
                                break;
                            case 2:
                                System.out.println("- - - Creacion de Rectangulo - - -");
                                System.out.println("Ingrese el largo del Rectangulo: ");
                                double rlargo=scanner.nextDouble();
                                System.out.println("Ingrese el alto del Rectangulo: ");
                                double ralto=scanner.nextDouble();
                                System.out.println("Ingrese el color de fondo de la Rectangulo");
                                String rcolorfondo=scanner.nextLine();
                                System.out.println("Ingrese el color de borde de la Rectangulo");
                                String rcolorborde=scanner.nextLine();
                                break;
                            case 3:
                                System.out.println("- - - Creacion de Circunferencia - - -");
                                System.out.println("Ingrese el largo de la Circunferencia: ");
                                double clargo=scanner.nextDouble();
                                System.out.println("Ingrese el alto de la Circunferencia: ");
                                double calto=scanner.nextDouble();
                                System.out.println("Ingrese el radio de la Circunferencia: ");
                                double cradio=scanner.nextDouble();
                                System.out.println("Ingrese el color de fondo de la Circunferencia");
                                String ccolorfondo=scanner.nextLine();
                                System.out.println("Ingrese el color de borde de la Circunferencia");
                                String ccolorborde=scanner.nextLine();
                                break;
                            default:
                                System.err.println("ERROR: Seleccione una opcion correcta!!!");
                                break;
                        }
                    } while(figura!=1 || figura!=2 || figura!=3);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 0:
                    
                    break;
                default:
                    scanner.close();
                    System.out.println("Saliendo del Sistema......");
                    break;
            }
        }while (opcion!=0);
    }
}
