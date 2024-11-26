package com.ricardorff.lista_de_compras.repo;

import org.springframework.data.repository.CrudRepository;
import com.ricardorff.lista_de_compras.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
}
