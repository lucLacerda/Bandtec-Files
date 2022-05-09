public class TreinadorPokemon {
    String nome;
    Integer nivel = 1;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() + (pokemon.getForca() * 0.1));
        pokemon.setDoces(pokemon.getDoces() + 10);

        System.out.printf("" +
                "\nO pokemon %s teve sua força aumentada em 10%%\n", pokemon.getNome());

        System.out.println(pokemon);
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao) {
        if (pokemon.getDoces() >= 50) {
            String nomeAntigo = pokemon.getNome();

            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);

            this.nivel += 10;

            System.out.printf("\nPokémon %s evoluiu para -> %s\n", nomeAntigo, nomeEvolucao);

        } else System.out.print("\nNão foi possível realizar operação\n");

        System.out.println(pokemon);
    }
}
