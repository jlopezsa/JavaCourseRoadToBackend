package org.jlopezsa.personascompanhia;

public class Cliente extends Persona {
    private int clienteId;

    public Cliente() {
    }


    public Cliente(int clienteId) {
        this.clienteId = clienteId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }


    public int getClienteId() {
        return this.clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String saludar() {
        return "soy el cliente ";
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " clienteId='" + getClienteId() + "'" +
            "}";
    }

}
