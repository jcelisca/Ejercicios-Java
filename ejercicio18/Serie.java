package ejercicio18;

public class Serie  implements Entregable {
    private String titulo;
    private int nroTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.nroTemporadas = 3;
        this.entregado = false;
        this.creador = creador;
    }

    public Serie(String titulo, int nroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nroTemporadas = nroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie [Creador= " + creador + ", Entregado= " + entregado + ", Genero= " + genero + ", Nro temporadas= "
                + nroTemporadas + ", Titulo= " + titulo + "]";
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
