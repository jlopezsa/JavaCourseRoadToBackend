package org.jlopezsa.mamiferos;

public class Lobo {
    private int numCamadas;
    private String especieLobo;

    public Lobo(int numCamadas, String especieLobo) {
        this.numCamadas = numCamadas;
        this.especieLobo = especieLobo;
    }

    public int getNumCamadas() {
        return this.numCamadas;
    }

    public void setNumCamadas(int numCamadas) {
        this.numCamadas = numCamadas;
    }

    public String getEspecieLobo() {
        return this.especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

}
