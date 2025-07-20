package com.Senac.GerenciadorDeFilmes.Controller;

import com.Senac.GerenciadorDeFilmes.Entity.FilmeModel;
import com.Senac.GerenciadorDeFilmes.Service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<FilmeModel> listar() {
        return filmeService.listarTodos();
    }

    @GetMapping("/id")
    public ResponseEntity<FilmeModel> buscar(@PathVariable Long id) {
        return filmeService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FilmeModel> criar(@RequestBody FilmeModel filme) {

        FilmeModel salvo = filmeService.salvar(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/id")
    public ResponseEntity<FilmeModel> atualizar(@PathVariable Long id, @RequestBody FilmeModel dados) {
        return filmeService.buscarPorId(id).map(filme -> {
            filme.setFilme(dados.getFilme());
            filme.setAnalise(dados.getAnalise());
            return ResponseEntity.ok(filmeService.salvar(filme));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deletar(@PathVariable Long id){
        if (filmeService.buscarPorId(id).isPresent()){
            filmeService.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}

