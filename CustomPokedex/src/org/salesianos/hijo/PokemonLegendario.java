package org.salesianos.hijo;

import org.salesianos.padre.Pokemon;

public class PokemonLegendario extends Pokemon {

    private String localizacion;

    // Creacion de los constructores heredados más implementacion del atributo
    // localizacion

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo, int altura, int peso, String descripcion,
        String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return nombre + "/n" +
                tipo + "/n" +
                " HT " + altura + "/n" +
                " WT " + peso +
                " Localizacion " + localizacion +
                "------------------------------------------------" + "/n" +
                descripcion;
    }

}
