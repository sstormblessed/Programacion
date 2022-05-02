package BoletinPOO;

public class Videojuego {
    private final int ESTIMADAS_DEF = 10;
    private final boolean ENTREGADO_DEF = false;
    private final String GENERO_DEF = "X";
    private final String CREADOR_DEF = "FromSoftware";

    String titulo;
    int h_estimadas;
    boolean entregado;
    String genero;
    String creador;

    // Constructor por defecto
    public Videojuego(){
        this.h_estimadas = ESTIMADAS_DEF;
        this.entregado = ENTREGADO_DEF;
    }

    // Constructor Título/Horas Estimadas
    public Videojuego(String t, int h){
        this.titulo = t;
        this.h_estimadas = h;
        this.entregado = ENTREGADO_DEF;
        this.genero = GENERO_DEF;
        this.creador = CREADOR_DEF;
    }

    // Constructor con todos los atributos menos "entregado"
    public Videojuego(String t, int n, String g, String c){
        this.titulo = t;
        this.h_estimadas = n;
        this.entregado = ENTREGADO_DEF;
        this.genero = g;
        this.creador = c;
    }

    @Override
    public String toString() {
        return "Videojuego [creador=" + creador + ", entregado=" + entregado + ", genero=" + genero + ", h_estimadas="
                + h_estimadas + ", titulo=" + titulo + "]";
    }

    
}
