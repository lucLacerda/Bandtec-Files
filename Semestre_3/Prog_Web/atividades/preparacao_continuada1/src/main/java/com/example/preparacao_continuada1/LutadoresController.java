package com.example.preparacao_continuada1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("lutadores")
public class LutadoresController {

    List<Lutadores> lutadoresList = new ArrayList<>();

    @PostMapping
    public Lutadores postLutadores(@RequestBody Lutadores lutador){
        lutadoresList.add(lutador);
        return lutador;
    }

}
