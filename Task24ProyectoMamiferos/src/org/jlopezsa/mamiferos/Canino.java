package org.jlopezsa.mamiferos;

public class Canino {
    private String color;
    private float tamanhoColmillos;

    public Canino(String color, float tamanhoColmillos) {
        this.color = color;
        this.tamanhoColmillos = tamanhoColmillos;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanhoColmillos() {
        return this.tamanhoColmillos;
    }

    public void setTamanhoColmillos(float tamanhoColmillos) {
        this.tamanhoColmillos = tamanhoColmillos;
    }

}
