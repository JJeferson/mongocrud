package com.mongocrud.mongocrud.repository;

import com.mongocrud.mongocrud.model.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produtos,String> {


}
