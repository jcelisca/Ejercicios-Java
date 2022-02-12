package ejercicio18;

public class Videojuego implements Entregable {
    private String titulo;
    private int horas_estimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compañia;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego [Compañia= " + compañia + ", Entregado= " + entregado + ", Genero= " + genero
                + ", Horas estimadas= " + horas_estimadas + ", Titulo= " + titulo + "]";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
    
}
