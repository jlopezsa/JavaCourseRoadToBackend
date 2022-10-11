package org.jlopezsa.personascompanhia;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente() {
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}
