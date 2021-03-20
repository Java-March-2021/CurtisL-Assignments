package pokePractice;

public abstract class AbstractPokemon implements PokemonInterface {
	

	public Pokemon createPokemon (String name, int health, String type){
		Pokemon poke = new Pokemon(name, type, health);
		
		Pokedex.myPokemons.add(poke);
		return poke;
	}
	
	public String pokemonInfo (Pokemon pokemon) {
		return pokemon.toString();
	}
	

		
	

}
