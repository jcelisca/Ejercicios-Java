import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int numero;
            do{
                System.out.print("Ingresa un número mayor que cero: ");
                numero = in.nextInt();
            }while(numero < 0);
        }
    }
}
