package com.desafiopubfuture.restapi;

import com.desafiopubfuture.restapi.basededados.DadosDespesas;
import com.desafiopubfuture.restapi.entidades.Despesas;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesasREST {

    @Autowired
    private DadosDespesas dados2;

    @GetMapping
    public List<Despesas> listar() {
        return dados2.findAll();
    }

    // Fazer consulta da listagem de Despesas do tipo Alimentação //
    @GetMapping("/getByTipoDespesaAlimentacao")
    public List<Despesas> listarTipoDespesa1(String tipoDespesa) {
        return dados2.getDespesaByTipoDespesa("Alimentação");
    }

    // Fazer consulta da listagem de Despesas do tipo Educação //
    @GetMapping("/getByTipoDespesaEducacao")
    public List<Despesas> listarTipoDespesa2(String tipoDespesa) {
        return dados2.getDespesaByTipoDespesa("Educação");
    }

    // Fazer consulta da listagem de Despesas do tipo Moradia //
    @GetMapping("/getByTipoDespesaMoradia")
    public List<Despesas> listarTipoDespesa3(String tipoDespesa) {
        return dados2.getDespesaByTipoDespesa("Moradia");
    }

    // Fazer consulta da listagem de Despesas do tipo Roupa //
    @GetMapping("/getByTipoDespesaRoupa")
    public List<Despesas> listarTipoDespesa4(String tipoDespesa) {
        return dados2.getDespesaByTipoDespesa("Roupa");
    }

    // Fazer consulta da listagem de uma data inicial e uma data final de Pagamento //
    // Exemplo configurado -> 10/01/2020 INICIAL para 01/01/2021 FINAL //
    @GetMapping("/findByDataPagamento")
    public List<Despesas> listarPorData(LocalDate data1, LocalDate data2) {
        LocalDate dat1 = LocalDate.of(2020, 1, 10);
        LocalDate dat2 = LocalDate.of(2021, 1, 1);
        return dados2.findByDataPagamento(dat1, dat2);
    }

    @PostMapping
    public void salvar(@RequestBody Despesas despesas) {

        if(despesas.getConta() > 0) {
        dados2.save(despesas);
        }
    }

    @PutMapping
    public void alterar(@RequestBody Despesas despesas) {
        if(despesas.getConta() > 0) {
            dados2.save(despesas);
        }
    }

    @DeleteMapping
    public void deletar(@RequestBody Despesas despesas) {
        dados2.delete(despesas);
    }

}

