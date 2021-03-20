package pokePractice;

public class Pokemon  {
	private String name="",type = "";
	private int health=0;
	private static int count;
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health-=10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Pokemon(String name, String type, int health) {
		super();
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
		Pokedex.myPokemons.add(this);
	}

	public Pokemon() {
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", health=" + health + "]";
	}
	
	
	
	

	
	
	
	
	
	
	

}
