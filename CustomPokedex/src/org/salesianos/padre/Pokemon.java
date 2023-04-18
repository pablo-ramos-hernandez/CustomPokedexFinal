package org.salesianos.padre;

public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int altura;
    protected int peso;
    protected String descripcion;

    // Creacion de un constructor

    public Pokemon(String nombre, String tipo, int altura, int peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    // Creacion de constructor con solo dos valores

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Creacion de los getters

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Creacion de los setters

    public void setAltura(int nuevaAltura) {
        this.altura = nuevaAltura;
    }

    public void setPeso(int nuevoPeso) {
        this.peso = nuevoPeso;
    }

    public void setDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    // Modificacion del toString

    @Override
    public String toString() {
        return nombre + "\n" +
                tipo + "\n" +
                " HT " + altura + "\n" +
                " WT " + peso + "\n" + 
                "------------------------------------------------" + "\n" +
                descripcion;

    }
}
