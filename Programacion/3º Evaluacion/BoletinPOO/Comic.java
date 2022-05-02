package BoletinPOO;

public class Comic {
    private final int DIAS_DEF = 5;
    private final boolean ENTREGADO_DEF = false;

    String titulo;
    int dias;
    boolean entregado;
    String editorial;
    String autor;

    // Un constructor por defecto.
    public Comic() {
        dias = DIAS_DEF;
        entregado = ENTREGADO_DEF;
    }

    // Un constructor con el titulo y dias estimadas.
    public Comic(String t, int d) {
        titulo = t;
        dias = d;
        entregado = ENTREGADO_DEF;
    }

    // Un constructor con todos los atributos, excepto de entregado.
    public Comic(String t, int d, String e, String a) {
        titulo = t;
        dias = d;
        entregado = ENTREGADO_DEF;
        editorial = e;
        autor = a;
    }

}
