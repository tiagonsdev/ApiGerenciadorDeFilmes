package com.Senac.GerenciadorDeFilmes.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_motoristas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilmeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String filme;
    private String analise;
}

