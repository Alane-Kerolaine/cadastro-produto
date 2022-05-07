package com.moderna.cadastroproduto.controller;

import com.moderna.cadastroproduto.model.ProdutoModel;
import com.moderna.cadastroproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/buscar-produto")
    public Optional<ProdutoModel> buscarProdutoPorId(@RequestParam Long id){
        return produtoService.buscarPorId(id);
    }

//    @GetMapping("/listar-produtos")
//    public Iterable<ProdutoModel> listarTodos(){
//        return produtoService.listarTodos();
//    }

    @GetMapping("/listar-todos")
    public List<ProdutoModel> listarTodos(){
        return produtoService.buscarTodos();
    }

}
