import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Ingresa un número: ");
            int numero = in.nextInt();
            while(numero <= 1000){
                System.out.println(numero);
                numero+=2;
            }
        }
    }
}
