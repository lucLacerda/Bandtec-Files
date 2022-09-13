package sptech.correcao01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping
    public Usuario postUsuario(@RequestBody Usuario novoUsuario) {
        usuarios.add(novoUsuario);
        return novoUsuario;
    }

    @PostMapping("/autenticacao/{usuario}/{senha}")
    public Usuario logonUsuario(@PathVariable String usuario,
                                @PathVariable String senha) {
        for (Usuario usuarioAtual : usuarios) {
            if (usuarioAtual.autenticar(usuario, senha)) {
                return usuarioAtual;
            } else {
                return null;
            }
        }
        return null;
    }

    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @DeleteMapping("/autenticacao/{usuario}")
    public String logoffUsuario(@PathVariable String usuario) {
        for (Usuario usuarioAtual : usuarios) {
            if (usuarioAtual.getUsuario().equals(usuario)) {
                if (usuarioAtual.isAutenticado()) {
                    usuarioAtual.setAutenticado(false);
                    return String.format("Logoff do usuário %s concluído", usuarioAtual.getNome());
                } else {
                    return String.format("Usuário %s NÃO está autenticado", usuarioAtual.getNome());
                }
            }
        }
        return String.format("Usuário %s não encontrado", usuario);
    }

    // EndPoints extras:

    @GetMapping("/autenticados")
    public List<Usuario> getUsuariosAutenticados() {
        return usuarios.stream()
                .filter(Usuario::isAutenticado)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/autenticacao")
    public String logoffGeral() {
        for (Usuario usuario : usuarios) {
            usuario.setAutenticado(false);
        }
        return "Todos os usuarios sofreram logoff!";
    }

    @GetMapping("/relatorio")
    public String getRelatorio() {
        long autenticados = usuarios.stream()
                                    .filter(Usuario::isAutenticado)
                                    .count();

        return String.format(
                "Total de usuários: %s. Autenticados: %d. Não autenticados: %s",
                usuarios.size(), autenticados, usuarios.size() - autenticados
        );
    }
}

