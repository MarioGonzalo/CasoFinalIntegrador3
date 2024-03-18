package org.example;

public class Ecosistema {
    public class Clima extends Ecosistema {
        public void clima() {
            System.out.println("El clima es templado");
        }
    }
    public class Terreno extends Ecosistema {
        public void terreno() {
            System.out.println("El terreno es montañoso");
        }
    }

    public class Recursos extends Ecosistema {
        public void recursos() {
            System.out.println("Los recursos son abundantes");
        }
    }
}
