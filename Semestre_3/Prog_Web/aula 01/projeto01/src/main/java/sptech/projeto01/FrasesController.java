package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//@RestController -> Isto é uma anotação (annotation)
//Está anotação indica que a classe será uma
//
@RestController
public class FrasesController {

    //    A anotação @GetMapping transforma o metodo anotado
//    em uma chamada da api rest do projeto
    @GetMapping
    public String cumprimentar() {
        return "é nóis numa rest API" +
                "<br><br>" +
                "<a href=\"/despedida\">Despedir</a>" +
                "<br><br>" +
                "<a href=\"/elogiar\">Elogiar</a>" +
                "<br><br>" +
                "<a href=\"/somar\">Somar</a>";
    }

    @GetMapping("/despedida")
    public String despedir() {
        return "Tchau, meus queridos!";
    }

    @GetMapping("/elogiar")
    public String elogiar() {
        return "Tu é lindo <3!" +
                "<img src:'https://www.realmadrid.com/img/vertical_380px/cristiano_550x650.jpg'>";
    }

    public String verificarMaior(int n1, int n2) {
        if (n1 > n2) {
            return "O maior é: " + n1;
        } else {
            return "O maior é: " + n2;
        }
    }

    @GetMapping("/maior/{n1}/{n2}")
    public String maior(@PathVariable int n1, @PathVariable int n2) {
        return verificarMaior(n1, n2);
    }
}
