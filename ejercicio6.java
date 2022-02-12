import java.util.ArrayList;

public class ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                pares.add(i);
            }else{
                impares.add(i);
            }
        }

        System.out.print("Los números pares son: "+pares);
        System.out.println("\n");
        System.out.print("Los números impares son: "+impares);
    }
}
