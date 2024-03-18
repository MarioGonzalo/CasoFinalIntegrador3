package org.example;

public class Plantas {
    public class Zarzamora extends Plantas {
        public void zarzamora() {
            System.out.println("La zarzamora es una planta silvestre");
        }
    }

    public class Rosa extends Plantas {
        public void rosa() {
            System.out.println("La rosa es una planta ornamental");
        }
    }

    public class Hierba extends Plantas {
        public void hierba() {
            System.out.println("La hierba es una planta comestible");
        }
    }
}
