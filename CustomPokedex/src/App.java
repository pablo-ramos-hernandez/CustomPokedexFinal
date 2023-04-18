import java.util.Scanner;

import org.salesianos.hijo.PokemonLegendario;
import org.salesianos.otros.ListaPokemon;
import org.salesianos.padre.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String opcion = "";
        String nombre = "";
        String tipo = "";
        int peso;
        int altura;
        String descripcion;
        String localizacion;
        int numeroPosicion;
        ListaPokemon listaAvistados = new ListaPokemon();
        ListaPokemon listaCapturados = new ListaPokemon();

        System.out.println("Bienvenido a la usuario");
        

        while (salir == false) {
                System.out.println("a " + "Añadir un pokemon avistado + " + "se solicitará al usuario el nombre y tipo de un pokemon y se añadirá a lista de pokemon avistados.");
                System.out.println("b " + "Añadir avistamiento legendario " + "se solicitará al usuario el nombre, tipo y localizacion del pokemon legendario y se añadirá a lista de pokemon avistados");
                System.out.println("c" + " Pasar a capturados " + "se solicitará al usuario el nombre del pokemon que previamente se haya avistado. Éste se buscará y eliminará de la lista de avistado y se añadirá a la lista de capturados tras solicitar al usuario y añadir la informacion adicional del pokemon: peso, altura y descripción");
                System.out.println("d" + " Mostrar lista de avistados" + " mostrará los elementos de la lista correspondiente");
                System.out.println("e " + "Mostrar lista de capturados " + "mostrará los elementos de la lista correspondiente");
                System.out.println("f " + "Cerrar la pokedex " + "se cierra el programa despidiéndose del usuario");

                opcion = teclado.nextLine();
            switch (opcion) {
                case "a":
                    System.out.println("Ingrese el nombre y tipo de pokemon del pokemon");
                    System.out.println("Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Tipo: ");
                    tipo = teclado.nextLine();

                    Pokemon pokemon = new Pokemon(nombre, tipo);
                    listaAvistados.addPokemonLista(pokemon);

                    System.out.println("Se ha completado la accion" + '\n');
                    break;
                case "b":
                    System.out.println("Ingrese el nombre, el tipo y la localizacion del pokemon legendario");

                    System.out.println("Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Tipo: ");
                    tipo = teclado.nextLine();
                    System.out.println("Localizacion: ");
                    localizacion = teclado.nextLine();

                    PokemonLegendario pokemonLegendario = new PokemonLegendario(nombre, tipo, localizacion);

                    listaAvistados.addPokemonLista(pokemonLegendario);

                    System.out.println("Se ha completado la accion" + '\n');
                    break;
                case "c":
                    System.out.println("Necesito la posicion del pokemon");
                    numeroPosicion = teclado.nextInt();

                    Pokemon pokemonCapturado = listaAvistados.retornar(numeroPosicion);

                    listaCapturados.addPokemonLista(pokemonCapturado);
                    listaAvistados.removePokemonLista(pokemonCapturado);

                    System.out.println("Para acabar introduzca los valores de los siguientes atributos");
                    System.out.println("Peso: ");
                    peso = teclado.nextInt();
                    pokemonCapturado.setPeso(peso);
                    System.out.println("Altura: ");
                    altura = teclado.nextInt();
                    pokemonCapturado.setAltura(altura);
                    teclado.nextLine();
                    System.out.println("Descripcion: ");
                    descripcion = teclado.nextLine();
                    pokemonCapturado.setDescripcion(descripcion);
                    break;
                case "d":
                    listaAvistados.display();
                    break;
                case "e":
                    listaCapturados.display();
                    break;
                case "f":
                    salir = true;
                    break;
            }
        }
    }
}
