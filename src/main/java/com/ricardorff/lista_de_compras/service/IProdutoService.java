package com.ricardorff.lista_de_compras.service;

import java.util.List;
import com.ricardorff.lista_de_compras.model.Produto;

public interface IProdutoService {
    public Object criarNovoProduto(Produto prod);
    public Produto alterarProduto(Produto prod);
    public List<Produto> listarTodos();
    public List<Produto> buscarPorPalavraChave(String key);
}
