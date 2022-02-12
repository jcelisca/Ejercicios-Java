import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Digita un dia de la semana: ");
            String dia = in.nextLine();
            dia.toLowerCase();

            switch(dia){
                case "lunes":
                    System.out.println("El "+dia+" es dia laboral");
                    break;
                case "martes":
                    System.out.println("El "+dia+" es dia laboral");
                    break;
                case "miercoles":
                    System.out.println("El "+dia+" es dia laboral");
                    break;
                case "jueves":
                    System.out.println("El "+dia+" es dia laboral");
                    break;
                case "viernes":
                    System.out.println("El "+dia+" es dia laboral");
                    break;
                case "sabado":
                    System.out.println("El "+dia+" es dia laboral");
                    break;
                case "domingo":
                    System.out.println("El "+dia+" no es dia laboral");
                    break;
                default:
                    System.out.println("El dia ingresado no es válido");
            }
        }
    }
}
