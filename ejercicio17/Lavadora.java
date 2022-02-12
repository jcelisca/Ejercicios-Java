package ejercicio17;

public class Lavadora extends Electrodomestico{
    private final double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
        this.carga = 5;
        this.precio_base = precio_base + preciofinal(carga);
        
    }

    public Lavadora(int carga, double precio_base, String color, char consumo_energetico, double peso) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
        this.precio_base = precio_base + preciofinal(carga);
        
    }

    public double getCarga() {
        return carga;
    }
    
    @Override
    public String toString() {
        return "Lavadora [carga = " + carga + ", Color = " + color + ", Consumo energetico = " + consumo_energetico + ", Peso = " + peso
        + ", Precio = " + precio_base + "]";
    }

    private double preciofinal(double carga){
        double precio_final = Lavadora.preciofinal(consumo_energetico, peso);
        if(carga > 30){
            return precio_final + 50;
        }
        return precio_final;
    }
    
}
