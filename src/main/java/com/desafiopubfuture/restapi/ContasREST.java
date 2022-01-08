package com.desafiopubfuture.restapi;

import com.desafiopubfuture.restapi.basededados.DadosContas;
import com.desafiopubfuture.restapi.entidades.Contas;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContasREST {
    
    @Autowired
    private DadosContas dados3;

    // Listar Todas Contas //
    @GetMapping
    public List<Contas> listar() {
        return dados3.findAll();
    }

    // Listar Saldo Total de Todas Contas Cadastradas //
    @GetMapping("/findSaldoTotal")
    public Float listarSaldoTotal() {
        return dados3.findBySaldoTotal();
    }

    @PostMapping
    public void salvar(@RequestBody Contas contas) {

        if(contas.getConta() > 0) {
        dados3.save(contas);
        }
    }

    @PutMapping
    public void alterar(@RequestBody Contas contas) {
        if(contas.getConta() > 0) {
            dados3.save(contas);
        }
    }

    @DeleteMapping
    public void deletar(@RequestBody Contas contas) {
        dados3.delete(contas);
    }

}
