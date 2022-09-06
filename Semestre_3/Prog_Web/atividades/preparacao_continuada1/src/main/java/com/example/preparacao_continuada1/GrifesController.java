package com.example.preparacao_continuada1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("grifes")
public class GrifesController {

    private List<Grifenoria> grifesList = new ArrayList<>();

    @GetMapping
    private List<Grifenoria> getGrifes(){
        return grifesList;
    }

    @PostMapping
    public Grifenoria postGrifes(@RequestBody Grifenoria grifenoria){
        grifesList.add(grifenoria);
        return grifenoria;
    }

    // @GetMapping("/{posicao}")
    //  public com.example.preparacao_continuada1.Grifes get(@PathVariable int posicao){
    //     return grifesList.get(posicao);
    //  }

    @DeleteMapping("/{posicao}")
    public String delete(@PathVariable int posicao){

        grifesList.remove(posicao);
        return "Excluído com sucesso!";
    }

    @PutMapping("/{posicao}")
    public Grifenoria putGrifenoria(@PathVariable int posicao, @RequestBody Grifenoria grifenoria){
        grifesList.set(posicao, grifenoria);
        return grifenoria;
    }

//    @GetMapping("/{id}")
//    public com.example.preparacao_continuada1.Grifes getCantorId(@PathVariable int id){
//        for (com.example.preparacao_continuada1.Grifes novoCantor : grifesList) {
//            if (novoCantor.getId() == id) {
//                return novoCantor;
//            }
//        }
//        return null;
//    }
//
//    @PutMapping("/{id}")
//    public com.example.preparacao_continuada1.Grifes putCantorId(@PathVariable int id, @RequestBody com.example.preparacao_continuada1.Grifes grifenoria){
//        for (com.example.preparacao_continuada1.Grifes novoCantor : grifesList) {
//            if (novoCantor.getId() == id) {
//                return grifenoria;
//            }
//        }
//        return null;
//    }
}
