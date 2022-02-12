import java.util.ArrayList;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int i = 0;

        while(i <= 100){
            if (i % 2 == 0){
                pares.add(i);
            }else{
                impares.add(i);
            }
            i++;
        }

        System.out.print("Los números pares son: "+pares);
        System.out.println("\n");
        System.out.print("Los números impares son: "+impares);
    }
}
