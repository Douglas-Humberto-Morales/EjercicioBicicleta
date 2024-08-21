package org.example;

public class Bicicleta {
    // Propiedades de la Bicicleta
    private String marca;
    private int modelo;
    private String color;
    private String tipo;
    private int velocidad = 0;

    // Constructor Vacio
    public Bicicleta (){}

    // Constructor Lleno
    public Bicicleta(String marca, int modelo, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
    }

    // Get y Set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getInfo(){
        return "Marca: " + marca + " Modelo: " + modelo + " Color: " + color + " Tipo: " + tipo;
    }


    //Acciones que hace la bici
    public String subirse(){
        return velocidad == 0 ? "Subiendose" : "Vas muy rapido";
    }

    public String bajarse(){
        return velocidad == 0 ? "Bajandose" : "Vas muy rapido";
    }

    public String andar(){
        return "Andando en velocidad: " + velocidad;
    }

    public String acelerar(){
        velocidad += 5;
        return "Acelerando";
    }

    public String desacelerar(){
        velocidad -= 5;
        return "Desacelerando";
    }
}
