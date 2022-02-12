import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Escribe la primer palabra: ");
            String palabra1 = in.nextLine();
            System.out.print("Escribe la segunda palabra: ");
            String palabra2 = in.nextLine();

            if(palabra1.equals(palabra2)){
                System.out.println("Las 2 palabras son iguales");
            }else{
                if(palabra1.length() >= palabra2.length()){
                    diffPalabras(palabra1, palabra2);
                }else{
                    diffPalabras(palabra2, palabra1);
                }
            }

        }
    }

    private static void diffPalabras(String palabra1, String palabra2){
        String word = "";
        for(int i = 0; i < palabra2.length(); i++){
            if(palabra1.charAt(i) != palabra2.charAt(i)){
                break;
            }
            word += palabra1.charAt(i);
        }
        if(word == ""){
            System.out.println("\nLas dos palabras son completamente diferentes");
        }else{
            String diff1 = palabra1.substring(word.length(), palabra1.length());
            if(word.length() == palabra2.length()){
                System.out.println("\nLas dos palabras son iguales en: "+word+", pero difieren en: "+diff1);
            }else{
                String diff2 = palabra2.substring(word.length(),palabra2.length());
                System.out.println("\nLas dos palabras son iguales en: "+word+", pero difieren en: "+diff1+" y "+diff2);
            }
        }
    }
}
