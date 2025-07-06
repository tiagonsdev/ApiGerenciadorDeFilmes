package com.Senac.GerenciadorDeFilmes.Controller;

import com.Senac.GerenciadorDeFilmes.Entity.FilmeModel;
import com.Senac.GerenciadorDeFilmes.Service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping("/form")
    public String exibirFormulario(Model model) {
        model.addAttribute("filme", new FilmeModel());
        return "formulario"; // procura templates/formulario.html
    }

    @PostMapping("/salvar")
    public String salvarFilme(@ModelAttribute FilmeModel filme) {
        filmeService.cadastrarFilme(filme);
        return "redirect:/filmes/form?sucesso";
    }
}
