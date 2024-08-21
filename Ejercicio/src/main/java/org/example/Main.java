package org.example;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        //Woy
        //Datos de la bicicleta
        bicicleta.setColor("Rojo");
        bicicleta.setMarca("Patito");
        bicicleta.setModelo(3);
        bicicleta.setTipo("Todo terreno");

        System.out.println(bicicleta.getInfo());

        System.out.println(bicicleta.subirse());
        System.out.println(bicicleta.andar());
        System.out.println(bicicleta.acelerar());
        System.out.println(bicicleta.andar());
        System.out.println(bicicleta.desacelerar());
        System.out.println(bicicleta.andar());
        System.out.println(bicicleta.bajarse());

    }
}