import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.print("Ingrese el primer número: ");
            int num1 = in.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = in.nextInt();

            if(num1 > num2){
                System.out.println(num1 + " es mayor que "+ num2);
            }else if(num1 == num2) {
                System.out.println(num1 + " y "+ num2 +" son iguales");
            } else {
                System.out.println(num2 + " es mayor que "+ num1);
            }
        }
    }
}
