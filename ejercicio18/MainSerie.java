package ejercicio18;

public class MainSerie {
    public static void main(String[] args) {
        Serie [] serie = new Serie[5];
        Videojuego [] game = new Videojuego[5];

        serie[0] = new Serie();
        serie[1] = new Serie("Peacemaker", 1, "Ficción", "James Gunn");
        serie[2] = new Serie("Daredevil", 3, "Ficción", "Drew Goddard");
        serie[3] = new Serie("Loki", 1, "Ficción", "Michael Waldron ");
        serie[4] = new Serie("The Punisher", 2, "Ficción", "Gerry Conway");

        game[0] = new Videojuego();
        game[1] = new Videojuego("Super Mario Bros", 3, "Videojuego de plataformas", "Nintendo");
        game[2] = new Videojuego("Resident Evil 4", 8, "Survival Horror", "CAPCOM");
        game[3] = new Videojuego("Call Of Duty", 10, "Disparos primera persona", "Activision");
        game[4] = new Videojuego("FIFA", 12, "Videojuego de deportes", "Electronic Arts");

        compareTo(serie);
        compareTo(game);
    }

    private static void compareTo(Object[] a){
        int mayor = 0;
        if(a instanceof Serie[]){
            Object serieM = new Object();
            for(Object e: a){
                if(((Serie) e).getNroTemporadas() >= mayor){
                    mayor = ((Serie) e).getNroTemporadas();
                    serieM = e;
                }
            }
            System.out.println("\nLa serie con mas temporadas tiene "+mayor+" temporadas.\n"+serieM);
        }
        if(a instanceof Videojuego[]){
            Object vGame = new Object();
            for(Object e: a){
                if(((Videojuego)e).getHoras_estimadas() >= mayor){
                    mayor = ((Videojuego)e).getHoras_estimadas();
                    vGame = e;
                }
            }
            System.out.println("\nEl videojuego con mas horas estimadas tiene "+mayor+" horas.\n"+vGame);
        }
    }
}
