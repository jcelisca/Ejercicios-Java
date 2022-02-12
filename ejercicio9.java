import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
        
            String text = "La sonrisa sera la mejor arma contra la tristeza";
            text = text.replace("a", "e");

            System.out.print("Copia una frase: ");
            String frase = in.nextLine();
            text = text.concat(" "+frase);

            System.out.print(text);
        }
    }
}
