import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.print("Ingresa el valor del producto: ");
            Double precio = in.nextDouble();

            double iva = precio*0.21;
            System.out.print("El iva del producto es de: "+iva); 
        }
    }
}
