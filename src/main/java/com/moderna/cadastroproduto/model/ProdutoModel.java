package com.moderna.cadastroproduto.model;

import javax.persistence.*;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAnoFabrica() {
        return anoFabrica;
    }

    public void setAnoFabrica(String anoFabrica) {
        this.anoFabrica = anoFabrica;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", anoFabrica='" + anoFabrica + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
