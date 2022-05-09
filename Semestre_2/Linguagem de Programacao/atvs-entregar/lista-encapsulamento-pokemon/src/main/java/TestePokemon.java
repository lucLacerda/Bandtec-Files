public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Charmander", "Fogo", 350., 0);
        TreinadorPokemon treinador1 = new TreinadorPokemon("Lucas", 50);

        System.out.println(pokemon1);

        // Treinando 5x
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);

        treinador1.evoluirPokemon(pokemon1, "Charmeleon");
        treinador1.evoluirPokemon(pokemon1, "Charizard");


    }
}
