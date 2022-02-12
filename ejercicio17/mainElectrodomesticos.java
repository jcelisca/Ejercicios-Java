package ejercicio17;


public class mainElectrodomesticos {
    public static void main(String[] args) {
        Electrodomestico [] productos = new Electrodomestico[10];
        productos[0] = new Television();
        productos[1] = new Electrodomestico();
        productos[2] = new Lavadora();
        productos[3] = new Lavadora(10, 150, "Gris", 'D', 100);
        productos[4] = new Television(45, false, 400, "negro", 'f', 50 );
        productos[5] = new Television(32, true, 200, "azul", 'g', 45 );
        productos[6] = new Lavadora(8, 288, "violeta", 'A', 76);
        productos[7] = new Television(80, true, 330, "gris", 'B', 60);
        productos[8] = new Lavadora(40, 300, "blanco", 'M', 150);
        productos[9] = new Electrodomestico(250, "negro", 'E', 88);

        double tvs = 0;
        double lav = 0;
        double elect = 0;
        for(int i = 0; i < productos.length; i++){
            System.out.println(productos[i]);
            if (productos[i] instanceof Television){
                tvs += productos[i].getPrecio_base();
            }else if (productos[i] instanceof Lavadora) {
                lav += productos[i].getPrecio_base(); 
            } else {
                elect += productos[i].getPrecio_base(); 
            }
        }
        System.out.println("\nLavadoras: "+ lav+ "\nTelevisores: "+tvs+"\nElectrodomesticos: "+elect+
        "\nPrecio total: "+(lav+tvs+elect));

    }
}