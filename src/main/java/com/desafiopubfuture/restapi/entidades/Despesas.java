package com.desafiopubfuture.restapi.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.Month;

@Entity(name = "Despesas")
public class Despesas {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conta;
    @Column(nullable = false)
    private double valor;
    @Column(nullable = false)
    private String tipoDespesa;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataPagamento;
    @Column(nullable = false)
    private LocalDate dataPagamentoEsperado = LocalDate.of(2020, Month.DECEMBER, 10);

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDate getDataPagamentoEsperado() {
        return dataPagamentoEsperado;
    }

    public void setDataPagamentoEsperado(LocalDate dataPagamentoEsperado) {
        this.dataPagamentoEsperado = dataPagamentoEsperado;
    }
}
