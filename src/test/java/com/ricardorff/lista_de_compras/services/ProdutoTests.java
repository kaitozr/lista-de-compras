package com.ricardorff.lista_de_compras.services;

import com.ricardorff.lista_de_compras.model.Produto;
import com.ricardorff.lista_de_compras.service.IProdutoService;
import com.ricardorff.lista_de_compras.service.ProdutoServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProdutoTests {

    @Autowired
    private ProdutoServiceImpl service;

    @BeforeAll
    public static void setup() {
        System.out.println("Configurando parametros de teste");
        newProduct = new Produto();
        newProduct.setNome("Bolacha");

        createdProduct = new Produto();
        createdProduct.setNome("Bolacha");
        createdProduct.setId(1);

        service = Mockito.mock((ProdutoServiceImpl.class));
    }

    @Test
    public void shouldStoreProduct() {
        Produto p = new Produto();
        p.setNome("Macarrão");
        assertNotNull(service.criarNovoProduto(p));
    }
}
