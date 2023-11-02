package Assesment1;

public class PokemonMaster {

	public static void main(String[] args) {

		int A=3; //No. of Pokeballs
		int B=4; //No. of Pokemons
		if(A>=1 && B<=8) {
			if(A>=B) 
				System.out.println(1);
			else
				System.out.println(0);
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
