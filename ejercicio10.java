import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.print("Copia una frase: ");
            String frase = in.nextLine();
            frase = frase.replace(" ", "");

            System.out.println(frase);
        }
    }
}
