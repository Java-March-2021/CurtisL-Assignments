package pokePractice;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
	public static ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();

	public  void listPokemon() {
		for(Pokemon pokemon:myPokemons) {
			System.out.println(pokemon.toString());
		}
	}

	
}
