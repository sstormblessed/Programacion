package BoletinPOO;

public class Serie {
    private final int TEMPORADAS_DEF = 3;
    private final boolean ENTREGADO_DEF = false;
    private final String GENERO_DEF = "X";

    String titulo;
    int n_temporadas;
    boolean entregado;
    String genero;
    String creador;

    // Constructor por defecto
    public Serie(){
        this.n_temporadas = TEMPORADAS_DEF;
        this.entregado = ENTREGADO_DEF;
    }

    // Constructor Título/Creador
    public Serie(String t, String c){
        this.titulo = t;
        this.n_temporadas = TEMPORADAS_DEF;
        this.entregado = ENTREGADO_DEF;
        this.genero = GENERO_DEF;
        this.creador = c;
    }

    // Constructor con todos los atributos menos "entregado"
    public Serie(String t, int n, String g, String c){
        this.titulo = t;
        this.n_temporadas = n;
        this.entregado = ENTREGADO_DEF;
        this.genero = g;
        this.creador = c;
    }

    @Override
    public String toString() {
        return "Serie [creador=" + creador + ", entregado=" + entregado + ", genero=" + genero
                + ", n_temporadas=" + n_temporadas + ", titulo=" + titulo + "]";
    }


}
