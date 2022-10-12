package org.jlopezsa.personascompanhia;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado() {
    }

    public Empleado(double remuneracion, int empleadoId) {
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
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

    @Override
    public String toString() {
        return super.toString() + "{" +
            " remuneracion='" + getRemuneracion() + "'" +
            ", empleadoId='" + getEmpleadoId() + "'" +
            "}";
    }

}
