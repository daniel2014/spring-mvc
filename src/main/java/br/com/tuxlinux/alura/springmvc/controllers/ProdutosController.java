package br.com.tuxlinux.alura.springmvc.controllers;

import br.com.tuxlinux.alura.springmvc.models.Produto;
import br.com.tuxlinux.alura.springmvc.services.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by deyve on 30/05/17.
 */

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    private ProdutosService produtosService;

    @Autowired
    public ProdutosController(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    @RequestMapping(value = "/form")
    public String form(Model model){

        model.addAttribute("produto", new Produto());

        return "produtos/form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Produto produto, Model model){

        System.out.println(produto);

        produtosService.salvar(produto);

        return "produtos/form";
    }
}
