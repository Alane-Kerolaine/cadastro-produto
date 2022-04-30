package com.moderna.cadastroproduto.service;

import com.moderna.cadastroproduto.model.ProdutoModel;
import com.moderna.cadastroproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel cadastrar(ProdutoModel produto){
        produtoRepository.save(produto);
                return produto;
    }

}
