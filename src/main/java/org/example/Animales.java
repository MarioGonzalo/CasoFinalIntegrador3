package org.example;

public class Animales {
    public class Conejo extends Animales {
        public void conejo() {
            System.out.println("El conejo es un animal herbívoro");
        }
    }

    public class Zorro extends Animales {
        public void zorro() {
            System.out.println("El zorro es un animal carnívoro");
        }
    }

    public class Lobo extends Animales {
        public void lobo() {
            System.out.println("El lobo es un animal salvaje");
        }
    }

    public class Abeja extends Animales {
        public void abeja() {
            System.out.println("La abeja es un animal polinizador");
        }
    }
}
