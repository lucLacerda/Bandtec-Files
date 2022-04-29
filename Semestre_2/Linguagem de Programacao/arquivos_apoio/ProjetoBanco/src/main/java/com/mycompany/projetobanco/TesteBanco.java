package com.mycompany.projetobanco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {

    public static void main(String[] args) {
        Connection config = new Connection();

        JdbcTemplate template = new JdbcTemplate(config.getDataSource());

        template.execute("DROP TABLE IF EXISTS pokemon");

        String criacaoTabelaPokemon = ""
                + "CREATE TABLE pokemon("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255),"
                + "tipo VARCHAR (255)"
                + ");";

        String inserirPokemon = "INSERT INTO pokemon VALUES(null, ?, ?)";

        template.execute(criacaoTabelaPokemon);

        template.update(inserirPokemon, "Charmander", "Fogo");

        List<Pokemon> listaPokemon01 = template.query("select * from pokemon",
                new BeanPropertyRowMapper<>(Pokemon.class));

        for (Pokemon pokemonDaVez : listaPokemon01) {
            System.out.println(pokemonDaVez);

        }

        /*
        for (int i = 0; i < listaPokemon01.size(); i++) {
            if (listaPokemon01.get(i).getNome().equals("Charmander")) {
                System.out.println("Esse existe no banco");
            }
            System.out.println(listaPokemon01);

        }
         */
    }

}
