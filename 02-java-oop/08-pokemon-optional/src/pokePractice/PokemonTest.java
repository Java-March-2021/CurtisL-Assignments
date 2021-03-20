package pokePractice;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon squirtle = new Pokemon("Squirtle","water",293);
		Pokemon bulbasaur = new Pokemon("Bulbasaur","grass",289);
		Pokemon charmander = new Pokemon("Charmander","fire",288);
		Pokemon pikachu	= new Pokemon("Pikachu","electric",290);
		
		squirtle.attackPokemon(charmander);
		charmander.attackPokemon(bulbasaur);
		bulbasaur.attackPokemon(squirtle);
		pikachu.attackPokemon(squirtle);
		
		Pokedex dex = new Pokedex();
		dex.listPokemon();
	}

}
