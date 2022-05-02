package BoletinPOO;

public abstract class Individuo {

    private final EnumSexo SEXO_DEF = EnumSexo.OTRO;

    // Atributos
    String nombre;
    int edad;
    EnumSexo sexo;

    // Constructor por defecto
    public Individuo() {
        sexo = SEXO_DEF;
    }

    // Constructor completo
    public Individuo(String name, int ed, EnumSexo s) {
        nombre = name;
        edad = ed;
        sexo = s;
    }

    @Override
    public String toString() {
        return "Individuo [SEXO_DEF=" + SEXO_DEF + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo + "]";
    }
    
    public boolean isDisponible;
}
