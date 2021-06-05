package com.mongocrud.mongocrud.controller;

import com.mongocrud.mongocrud.model.Produtos;
import com.mongocrud.mongocrud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/cadastros")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional
    @CacheEvict(value = "/produtos", allEntries = true)
    @PostMapping("/produtos")
    public ResponseEntity<Produtos> gravaProdutos (@RequestBody Produtos produtos){
        return ResponseEntity.ok(produtoRepository.save(produtos));
    }


    @GetMapping("/produtos")
    public ResponseEntity<List<Produtos>> listaProdutos(){
        List<Produtos> listaProdutos = produtoRepository.findAll();
        return ResponseEntity.ok(listaProdutos);
    }
}
