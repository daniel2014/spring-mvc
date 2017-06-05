package br.com.tuxlinux.alura.springmvc.repositories;


import br.com.tuxlinux.alura.springmvc.models.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by deyve on 30/05/17.
 */

@Repository
@Transactional
public class ProdutosRepository  {

    @PersistenceContext
    private EntityManager manager;

    public void save(Produto produto){

        System.out.println("Repository: " + produto);

        manager.persist(produto);

    }

}
