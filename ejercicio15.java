import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int option = 0;
            while(option != 8){

                System.out.print("\n\n****** GESTION CINEMATOGRÁFICA ********\n"+
                "1-NUEVO ACTOR\n"+
                "2-BUSCAR ACTOR\n"+
                "3-ELIMINAR ACTOR\n"+ 
                "4-MODIFICAR ACTOR\n"+
                "5-VER TODOS LOS ACTORES\n"+ 
                "6- VER PELICULAS DE LOS ACTORES\n"+ 
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"+ 
                "8-SALIR\n"+
                "Elige un opción: ");
                option = in.nextInt();
                switch(option){
                     case 1:
                        break;
                     case 2: 
                        break;
                     case 3:
                        break;
                     case 4: 
                        break;
                     case 5:
                        break;
                     case 6: 
                        break;
                    case 7:
                        break;
                    case 8: 
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
            }
        }
    }
}
