package com.moderna.cadastroproduto.service;

import com.moderna.cadastroproduto.model.ProdutoModel;
import com.moderna.cadastroproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel cadastrar(ProdutoModel produto){
        produtoRepository.save(produto);
                return produto;
    }

    public Optional<ProdutoModel> buscarPorId(@RequestParam Long id){
        return produtoRepository.findById(id);
    }


//    public Iterable<ProdutoModel> listarTodos(){
//        return produtoRepository.findAll();
//    }

    public List<ProdutoModel> buscarTodos(){
        return (List<ProdutoModel>) produtoRepository.findAll();
    }


}
