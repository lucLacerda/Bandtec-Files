package com.mycompany.projeto.revisao.jdbc;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

    public static void main(String[] args) {

        Connection connection = new Connection();
        JdbcTemplate template = new JdbcTemplate(connection.getDataSource());

        template.execute("DROP TABLE jogo IF EXISTS");

        StringBuilder builder = new StringBuilder();

        builder.append("CREATE TABLE jogo(");
        builder.append("id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,");
        builder.append("nome VARCHAR(200),");
        builder.append("genero VARCHAR(200)");
        builder.append(");");

        template.execute(builder.toString());
        template.update("INSERT INTO jogo VALUES(null, ?, ?)",
                "Sonic", "Plataforma");
        template.update("INSERT INTO jogo VALUES(null, ?, ?)",
                "FIFA 23", "Esportes");

        //       List jogos = template.queryForList("SELECT * FROM jogo");
        //      for (Object jogo : jogos) {
        //        System.out.println(jogo.toString());
        //  }
        List<Jogos> jogos = template.query("SELECT * FROM JOGO", new BeanPropertyRowMapper<>(Jogos.class));

        System.out.println("Query com BeanPropertyRowMapper");
        for (Jogos jogo : jogos) {
            System.out.println(jogo.getNome());
        }
    }
}
