package com.Senac.GerenciadorDeFilmes.Service;

import com.Senac.GerenciadorDeFilmes.Entity.FilmeModel;
import com.Senac.GerenciadorDeFilmes.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public FilmeModel salvar(FilmeModel filmeModel){
        return filmeRepository.save(filmeModel);
    }

    public List<FilmeModel> listarTodos(){
        return filmeRepository.findAll();
    }

    public Optional<FilmeModel> buscarPorId(Long id){
        return filmeRepository.findById(id);
    }

    public void deletar(Long id){
         filmeRepository.deleteById(id);
    }
}
