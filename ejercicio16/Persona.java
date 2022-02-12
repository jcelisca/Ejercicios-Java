package ejercicio16;

public class Persona {
    private String nombre = "";
    private int edad;
    private int DNI = generarDNI();
    private final String sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.sexo = "H";
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getDNI() {
        return DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "Persona [DNI=" + DNI + ", Altura=" + altura + ", Edad=" + edad + ", Nombre=" + nombre + ", Peso=" + peso
                + ", Sexo=" + sexo + "]";
    }

    public final int calcularIMC(){
        double imc = this.peso/Math.pow(this.altura, 2);
        if (imc < 20.0){
            return -1;
        }
        if(imc >= 20.0 && imc <= 25.0 ) {
            return 0;
        }
        return 1;
    }

    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(this.edad >= 18){
            mayor = true;
        }
        return mayor;
    }

    private String comprobarSexo(String sexo){
        if(sexo.equals("H") || sexo.equals("M")){
            return sexo;
        }
        return "H";
    } 

    private int generarDNI(){
        int dni = (int) (Math.random()*100000000-10000000);
        return dni;
    }

}
