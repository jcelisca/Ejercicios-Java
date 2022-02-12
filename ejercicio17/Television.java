package ejercicio17;

public class Television extends Electrodomestico {
    private final int resolucion;
    private final boolean sintonizadorTDT;

    public Television() {
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precio_base, double peso){
        super(precio_base, peso);
        this.precio_base = precio_base + preciofinal(20, false, precio_base);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precio_base, String color, char consumo_energetico, double peso){
        super(precio_base, color, consumo_energetico, peso);
        this.precio_base = precio_base + preciofinal(resolucion, sintonizadorTDT, precio_base);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Television [Resolucion = " + resolucion + ", SintonizadorTDT = " + sintonizadorTDT + ", Color = " + color + ", Consumo energetico = " 
        + consumo_energetico + ", Peso = " + peso + ", Precio = " + precio_base + "]";
    }

    private double preciofinal(int resolucion, boolean sintonizadorTDT, double precio_base){
        double precio_final = Television.preciofinal(consumo_energetico, peso);
        if (resolucion > 40){
            precio_final += (precio_base*0.3);
        }
        if(sintonizadorTDT){
            precio_final += 50;
        }
        return precio_final;

    }
    
}
