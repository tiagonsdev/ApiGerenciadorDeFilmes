package com.Senac.GerenciadorDeFilmes.Service;

import com.Senac.GerenciadorDeFilmes.Entity.FilmeModel;
import com.Senac.GerenciadorDeFilmes.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public FilmeModel cadastrarFilme(FilmeModel filmeModel){
        return filmeRepository.save(filmeModel);
    }
}
