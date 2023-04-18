package org.salesianos.otros;

import org.salesianos.padre.Pokemon;

public class ListaPokemon {

    // Array de Pokemon
    private Pokemon[] arrPokemon;
    private int limite = 0;

    // Asignacion de espacio
    public ListaPokemon() {
        this.arrPokemon = new Pokemon[1];
    }

    // Añadir pokemon a la lista
    public void addPokemonLista(Pokemon obPokemon) {
        Pokemon[] nPokemons = new Pokemon[this.limite + 1];

        for (int i = 0; i < this.arrPokemon.length; i++) {
            nPokemons[i] = this.arrPokemon[i];
        }

        nPokemons[this.limite] = obPokemon;

        this.arrPokemon = nPokemons;
        this.limite++;

        System.out.println("La accion se ha hecho correctamente");
    }

    // Borrar pokemon de la lista
    public void removePokemonLista(Pokemon nombrePokemon) {
        int totalObjetos = 0;

        for (int i = 0; i < this.arrPokemon.length; i++) {
            if (this.arrPokemon[i].equals(nombrePokemon)) {
                this.arrPokemon[i] = null;
            } else {
                totalObjetos++;
            }
        }

        Pokemon[] nPokemon = new Pokemon[totalObjetos];
        int nTotalPokemon = 0;

        for (int i = 0; i < this.arrPokemon.length; i++) {
            if (this.arrPokemon[i] != null) {
                nPokemon[nTotalPokemon] = this.arrPokemon[i];
                nTotalPokemon++;
            }

        }

        System.out.println("Accion terminada");
    }

    // Mostrar informacion del pokemon
    public void display() {
        System.out.println("----------------------");
        for (Pokemon pokemon : this.arrPokemon) {
            System.out.println("-> " + pokemon);
        }
    }

    // Devolver la posicion del Pokemon
    public Pokemon retornar(int posicionPokemon) {
        return (arrPokemon[posicionPokemon - 1]);
    }
}
