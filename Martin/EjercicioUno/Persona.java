public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private double peso;
    private double altura;
    private char sexo;

    public Persona (String nombre, String apellido, int edad,int dni, double peso, double altura, char sexo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;
        this.sexo=sexo;
    }

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

    public String getApellido() {return this.apellido;}
    public void setApellido(String apellido) {this.apellido=apellido;}

    public int getEdad() {return this.edad;}
    public void setEdad(int edad) {this.edad=edad;}

    public int getDni() {return this.dni;}
    public void setDni(int dni) {this.dni=dni;}

    public double getPeso() {return this.peso;}
    public void setPeso(double peso) {this.peso=peso;}

    public double getAltura() {return this.altura;}
    public void setAltura(double altura){this.altura=altura;}

    public char getSexo() {return this.sexo;}
    public void setSexo(char sexo) {this.sexo=sexo;}

    public int calcularIMC() {
       double imc = peso / (altura*altura);
    
       if(imc < 18) {
        return -1;
       } else if(imc >= 18 && imc<=25) {
        return 1;
       } else {
        return 0;
       }

    }
    public boolean esMayorDeEdad() {
        return edad > 18;
    }
    public boolean esMayorQue(Persona p) {
        return this.edad > p.getEdad();
    }

    public String toString() {
        return "[Nombre: " + nombre+",Apellido: " + apellido+",Edad: " + edad+",Dni: " + dni+",Peso: " + peso+",Altura " + altura+", " + altura+",Sexo: " + sexo+"]";
        
    }


}