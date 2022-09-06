package com.example.c101212151lucasribeirodelacerda;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuarios> usuariosList = new ArrayList<>();

    @PostMapping
    public Usuarios postUsuarios(@RequestBody Usuarios usuario) {
        usuariosList.add(usuario);
        return usuario;
    }

    @GetMapping
    private List<Usuarios> getUsuarios() {
        return usuariosList;
    }

    @PostMapping("/autenticacao/{usuario}/{senha}")
    public Usuarios postAutenticacao(@PathVariable String usuario, @PathVariable String senha) {
        for (Usuarios user : usuariosList) {
            if (user.getUsuario().equals(usuario) && user.validarSenha(senha)) {
                user.setAutenticado(true);
                return user;
            }
        }
        return null;
    }

    @DeleteMapping("autenticacao/{usuario}")
    public String logoffUsuario(@PathVariable String usuario) {
        for (Usuarios user : usuariosList) {
            if (user.getUsuario().equals(usuario)) {
                if (user.isAutenticado().equals(false)) {
                    return "Usuário " + usuario + " NÃO está autenticado";
                } else {
                    user.setAutenticado(false);
                    return "Logoff do usuário " + usuario + " concluído";
                }
            }
            return "Usuário " + usuario + " não encontrado";
        }
        return null;


    }

    @PatchMapping("/trocarSenha/{usuario}/{novaSenha}")
    public String patchSenha(@PathVariable String usuario, @PathVariable String novaSenha) {
        for (Usuarios user : usuariosList) {
            if (user.getUsuario().equals(usuario)) {
                if (user.isAutenticado().equals(false)) {
                    return "Usuário " + usuario + " NÃO está autenticado";
                } else {
                    user.setSenha(novaSenha);
                    return "Sua senha foi alterada com sucesso!";
                }
            }
            return "Usuário " + usuario + " não encontrado";
        }
        return null;
    }
}

