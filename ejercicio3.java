import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.print("Ingrese el radio del círculo: ");
            Double radio = in.nextDouble();

            double area = Math.PI*Math.pow(radio,2);

            System.out.print("El área del círculo es: "+ area);
        }
    }
}
