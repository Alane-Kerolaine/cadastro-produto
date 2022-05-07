package com.moderna.cadastroproduto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "db_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
    private String modelo;

    @Column(length = 200, nullable = false)
    private String marca;

    @Column(nullable = false)
    private double valor;

    @Column( length = 10)
    private String anoFabrica;

    @Column(length = 20)
    private String cor;
}
