package com.moderna.cadastroproduto.controller;

import com.moderna.cadastroproduto.model.ProdutoModel;
import com.moderna.cadastroproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/cadastro-produto")
    public ProdutoModel cadastrarProduto(@RequestBody ProdutoModel produto){
        produtoService.cadastrar(produto);
        return produto;
    }

}
