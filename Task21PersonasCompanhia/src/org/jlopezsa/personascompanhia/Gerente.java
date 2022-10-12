package org.jlopezsa.personascompanhia;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente() {
    }


    public Gerente(double presupuesto) {
        this.presupuesto = presupuesto;
    
    }
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);

        this.presupuesto = presupuesto;
    }


    public double getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String saludar() {
        return "soy el gerente ";
    }


    @Override
    public String toString() {
        return "{" +
            " presupuesto='" + getPresupuesto() + "'" +
            "}";
    }


}
