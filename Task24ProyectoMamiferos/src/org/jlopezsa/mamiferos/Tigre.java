package org.jlopezsa.mamiferos;

public class Tigre extends Felino {
    // Tigre es una clase concreta

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

    @Override
    public String comer() {
        return "El tigre " + getEspecieTigre() + " que tiene un tamaño de garras de " + getTamanhoGarras() + "cm y que corre a una velocidad de " + getVelocidad() + "km/h habita en " + getHabitat() + "caza para comer cebraz"; 
         
    }

    @Override
    public String dormir() {
        return "Duerme cerca a los árboles";
        
    }
    
    @Override
    public String correr() {
        return "Corre a una velocidad de " + getVelocidad() + "km/h";
        
    }
    
    @Override
    public String comunicarse() {
        return "Se comunica a maullidos";
    }

    

}
