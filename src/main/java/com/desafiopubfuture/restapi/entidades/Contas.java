package com.desafiopubfuture.restapi.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Contas")
public class Contas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conta;
    private float saldo;
    @Column(nullable = false)
    private String tipoConta;
    @Column(nullable = false)
    private String instituicaoFinanceira;

    public Contas(Long conta, String tipoConta, String instituicaoFinanceira) {
        this.conta = conta;
        this.tipoConta = tipoConta;
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }
    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }
    public Long getConta() {
        return conta;
    }
    public void setConta(Long conta) {
        this.conta = conta;
    }

}
