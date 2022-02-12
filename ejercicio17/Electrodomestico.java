package ejercicio17;

public class Electrodomestico {
    public double precio_base;
    public final String color;
    public final char consumo_energetico;
    public final double peso;
    
    public Electrodomestico() {
        this.precio_base = 100;
        this.color = "Blanco";
        this.consumo_energetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base + preciofinal('F', peso);
        this.color = "Blanco";
        this.consumo_energetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base + preciofinal(consumo_energetico, peso);
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico [Color = " + color + ", Consumo energetico = " + consumo_energetico + ", Peso = " + peso
                + ", Precio = " + precio_base + "]";
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        String letter = String.valueOf(letra);
        letter = letter.toLowerCase();
        if(letter.equals("a") || letter.equals("b") || letter.equals("c") ||letter.equals("d") ||letter.equals("e") ||letter.equals("f")){
            return letra;
        }
        return 'F';
    }

    private String comprobarColor(String color){
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("gris") || color.equals("rojo") || color.equals("azul")){
            return color;
        }
        return "Blanco";
    }

    public static double preciofinal(char letra, double peso){
        double precio_final = 0;
        String letter = String.valueOf(letra);
        letter = letter.toLowerCase();
        if(letter.equals("a")){
            precio_final += 100;
        }else if(letter.equals("b")){
            precio_final += 80;
        }else if(letter.equals("c")){
            precio_final += 60;
        }else if(letter.equals("d")){
            precio_final += 50;
        }else if(letter.equals("e")){
            precio_final += 30;
        }else if(letter.equals("f")){
            precio_final += 10;
        }else{
            precio_final += 10;
        }

         if(peso >=0 && peso <= 19){
            precio_final += 10;
         }else if(peso >= 20 && peso <= 49){
            precio_final += 50;
         }else if(peso >= 50 && peso <= 79){
            precio_final += 80;
         }else if(peso >= 80 ){
            precio_final += 100;
         }else{
            precio_final += precio_final;
         }

        return precio_final;
    }
    
}