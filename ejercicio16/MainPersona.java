package ejercicio16;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.print("Nombre: ");
            String nombre = in.nextLine();

            System.out.print("Sexo H o M : ");
            String sexo = in.nextLine();

            System.out.print("Edad: ");
            int edad = in.nextInt();

            System.out.print("Peso: ");
            double peso = in.nextDouble();

            System.out.print("Altura: ");
            double altura = in.nextDouble();

            Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
            Persona persona2 = new Persona(nombre, edad, sexo);
            Persona persona3 = new Persona();
            persona3.setNombre("Pablo");
            persona3.setEdad(17);
            persona3.setPeso(70.0);
            persona3.setAltura(1.83);

            System.out.println("\n");
            IMC(persona1);
            IMC(persona2);
            IMC(persona3);

            mayorEdad(persona1);
            mayorEdad(persona2);
            mayorEdad(persona3);

            System.out.println(persona1);
            System.out.println(persona2);
            System.out.println(persona3);
        }
    }

    public static void IMC(Persona persona){
        int imc = persona.calcularIMC();
        if(imc == -1){
            System.out.println(persona.getNombre()+" esta por debajo del peso ideal.");
        }
        if (imc == 0) {
            System.out.println(persona.getNombre()+" tiene el peso ideal.");
        } else {
            System.out.println(persona.getNombre()+" esta por encima del peso ideal.");
        }
    }

    public static void mayorEdad(Persona persona){
        boolean valor = persona.esMayorDeEdad();
        if (valor){
            System.out.println(persona.getNombre()+" es mayor de edad.");
        }else{
            System.out.println(persona.getNombre()+" es menor de edad.");
        }
    }
}
