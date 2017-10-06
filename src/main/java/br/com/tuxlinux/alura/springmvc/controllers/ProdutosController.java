package br.com.tuxlinux.alura.springmvc.controllers;

import br.com.tuxlinux.alura.springmvc.models.Produto;
import br.com.tuxlinux.alura.springmvc.models.TipoPreco;
import br.com.tuxlinux.alura.springmvc.services.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        // model.addAttribute("tipos", TipoPreco.values());

        return "produtos/form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String gravar(Produto produto, Model model, RedirectAttributes redirectAttributes){

        System.out.println(produto);

        produtosService.salvar(produto);

        model.addAttribute("produto", new Produto());

        redirectAttributes.addFlashAttribute("message", "Salvo com sucesso!");

        return "produtos/form";
    }

    @ModelAttribute(value = "tipos")
    public TipoPreco[] getTipoPreco(){

        return TipoPreco.values();
    }
}
