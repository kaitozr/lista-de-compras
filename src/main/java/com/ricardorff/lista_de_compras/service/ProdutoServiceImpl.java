package com.ricardorff.lista_de_compras.service;

import java.util.List;
import com.ricardorff.lista_de_compras.model.Produto;
import com.ricardorff.lista_de_compras.repo.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutoServiceImpl implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto criarNovoProduto(Produto prod) {
        return repo.save(prod);
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        return List.of();
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        return List.of();
    }
}



