package org.jlopezsa.mamiferos;

abstract public class Felino extends Mamifero {
    // Clase hija abstracta no está obligada de implementar los métodos abstractos.
    
    private float tamanhoGarras;
    private int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanhoGarras,
            int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanhoGarras = tamanhoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanhoGarras() {
        return this.tamanhoGarras;
    }

    public void setTamanhoGarras(float tamanhoGarras) {
        this.tamanhoGarras = tamanhoGarras;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
