import java.util.HashMap;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.print("Copia una frase: ");
            String frase = in.nextLine();
            int longitud = frase.length();

            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("a", 0);
            hashMap.put("e", 0);
            hashMap.put("i", 0);
            hashMap.put("o", 0);
            hashMap.put("u", 0);

            for (int i = 0; i < frase.length(); i++) {
                char letraActual = frase.charAt(i);
                if (esVocal(letraActual)) {
                    String clave = String.valueOf(letraActual).toLowerCase();
                    hashMap.put(clave, hashMap.get(clave) + 1);
                }
            }
            System.out.println("La frase tiene " +longitud+" letras");
            System.out.printf("Resultados para '%s':\n", frase);
            for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.printf("Vocal: %s. Conteo: %d\n", entry.getKey(), entry.getValue());
            }
        }
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }
}
