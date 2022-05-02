package BoletinPOO;

public class testSVE {

    public static void main(String[] args) {

        int contS = 0;
        int contV = 0;
        int contC = 0;

        Serie uno = new Serie("uno", 5, "f", "uno");
        Serie dos = new Serie("dos", 8, "f", "dos");
        Serie tres = new Serie("tres", 3, "f", "tres");

        Videojuego one = new Videojuego("one", 14, "rpg", "one");
        Videojuego two = new Videojuego("one", 14, "rpg", "one");
        Videojuego three = new Videojuego("one", 14, "rpg", "one");

        Comic a = new Comic("a", 6, "a", "a");
        Comic b = new Comic("b", 3, "b", "b");
        Comic c = new Comic("c", 8, "c", "c");

        Serie[] yonkis = { uno, dos, tres };
        Videojuego[] meta = { one, two, three };
        Comic[] marvel = { a, b, c };

        uno.entregar();
        tres.entregar();
        two.entregar();

        for(Serie s : yonkis){
            System.out.println(s.toString());
            if(s.isEntregado()){
                contS++;
                s.devolver();
            }
        }
        System.out.println("Series entregadas: " + contS);

        for(Videojuego v : meta){
            System.out.println(v.toString());
            if(v.isEntregado()){
                contV++;
                v.devolver();
            }
        }
        System.out.println("Videojuegos entregados: " + contV);

        for(Comic c : marvel){
            System.out.println(c.toString());
            if(c.isEntregado()){
                contC++;
                c.devolver();
            }
        }
        System.out.println("Comics entregados: " + contC);

        // Búsqueda de más temporadas
        Serie max = yonkis[0];

        for(Serie s : yonkis){
            if(s.compareTo(max) > 0){
                max = s;
            }
        }
        System.out.println("Serie con más temporadas: " max.toString());

        // Búsqueda de más horas jugables
        Videojuego mx = meta[0];

        for(Videojuego v : meta){
            if(v.compareTo(mx) > 0){
                mx = v;
            }
        }
        System.out.println("Videojuego con más horas jugables: " mx.toString());

        // Búsqueda de más días
        Comic top = marvel[0];

        for(Comic c : marvel){
            if(c.compareTo(top) > 0){
                top = c;
            }
        }
        System.out.println("Comic con más días: " top.toString());
    }

}
