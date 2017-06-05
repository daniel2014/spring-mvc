package br.com.tuxlinux.alura.springmvc.services;

import br.com.tuxlinux.alura.springmvc.models.Produto;
import br.com.tuxlinux.alura.springmvc.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by deyve on 30/05/17.
 */

@Service
public class ProdutosService {

    private ProdutosRepository produtosRepository;

    @Autowired
    public ProdutosService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    public void salvar(Produto produto) {

        System.out.println("Service: " + produto);

        produtosRepository.save(produto);
    }
}
