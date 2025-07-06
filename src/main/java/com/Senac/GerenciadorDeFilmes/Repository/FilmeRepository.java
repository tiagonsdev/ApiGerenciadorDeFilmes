package com.Senac.GerenciadorDeFilmes.Repository;

import com.Senac.GerenciadorDeFilmes.Entity.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<FilmeModel, Long> {
}
