package org.jlopezsa.mamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanhoGarras,
            int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanhoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return this.especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

}
