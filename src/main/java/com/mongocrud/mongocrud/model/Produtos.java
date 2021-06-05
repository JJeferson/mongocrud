package com.mongocrud.mongocrud.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Getter
@Setter
public class Produtos {
   @Id
   private String   codigoProduto;
   private String   nomeProduto;
   private float    qtdeEstoqueAtual;
   private Long     numeroReferencia;
}
