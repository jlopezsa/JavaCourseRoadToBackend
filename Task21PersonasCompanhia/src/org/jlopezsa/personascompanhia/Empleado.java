package org.jlopezsa.personascompanhia;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado() {
    }

    public int getEmpleadoId() {
        return this.empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return this.remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion = this.remuneracion + this.remuneracion * (double) porcentaje / 100;
    }

    @Override
    public String saludar() {
        return "soy el empleado ";
    }

}
