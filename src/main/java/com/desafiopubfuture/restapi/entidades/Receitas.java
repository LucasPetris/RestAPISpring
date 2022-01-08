package com.desafiopubfuture.restapi.entidades;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "Receitas")
public class Receitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conta;
    @Column(nullable = false)
    private double valor;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String tipoReceita;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataRecebimento;
    @Column(nullable = false)
    private LocalDate dataRecebimentoEsperado = LocalDate.of(2020, Month.SEPTEMBER, 15);

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Long getConta() {
        return conta;
    }
    public void setConta(Long conta) {
        this.conta = conta;
    }
    public String getTipoReceita() {
        return tipoReceita;
    }
    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }
    public LocalDate getDataRecibemento() {
        return dataRecebimento;
    }
    public void setDataRecibemento(LocalDate dataRecibemento) {
        this.dataRecebimento = dataRecibemento;
    }
    public LocalDate getDataRecebimentoEsperado() {
        return dataRecebimentoEsperado;
    }
    public void setDataRecebimentoEsperado(LocalDate dataRecebimentoEsperado) {
        this.dataRecebimentoEsperado = dataRecebimentoEsperado;
    }



}
