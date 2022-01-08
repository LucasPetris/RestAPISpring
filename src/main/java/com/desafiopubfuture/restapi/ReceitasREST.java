package com.desafiopubfuture.restapi;

import java.time.LocalDate;
import java.util.List;

import com.desafiopubfuture.restapi.basededados.DadosReceitas;
import com.desafiopubfuture.restapi.entidades.Receitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receitas")
public class ReceitasREST {
    
    @Autowired
    private DadosReceitas dados;


    // Fazer consulta da listagem de todos tipos de Receitas

    @GetMapping
    public List<Receitas> listar() {
        return dados.findAll();
    }

    // Fazer consulta da listagem de Receitas do tipo Salário //
    @GetMapping("/getByTipoReceitaSalario")
    public List<Receitas> listarTipoReceita1(String tipoReceita) {
        return dados.getReceitaByTipoReceita("Salário");
    }

    // Fazer consulta da listagem de Receitas do tipo Outros //
    @GetMapping("/getByTipoReceitaOutros")
    public List<Receitas> listarTipoReceita2(String tipoReceita) {
        return dados.getReceitaByTipoReceita("Outros");
    }

    // Fazer consulta da listagem de Receitas do tipo Presente //
    @GetMapping("/getByTipoReceitaPresente")
    public List<Receitas> listarTipoReceita3(String tipoReceita) {
        return dados.getReceitaByTipoReceita("Presente");
    }

    // Fazer consulta da listagem de uma data inicial e uma data final de recebimento //
    // Exemplo configurado -> 01/10/2018 INICIAL para 10/10/2021 FINAL //
    @GetMapping("/findByDataRecebimento")
    public List<Receitas> listarPorData(LocalDate data1, LocalDate data2) {
        LocalDate dat1 = LocalDate.of(2018, 1, 10);
        LocalDate dat2 = LocalDate.of(2021, 10, 10);
        return dados.findByDataRecebimento(dat1, dat2);
    }
    
    @PostMapping
    public void salvar(@RequestBody Receitas receita) {

        if(receita.getConta() > 0) {
        dados.save(receita);
        }
    }

    @PutMapping
    public void alterar(@RequestBody Receitas receita) {
        if(receita.getConta() > 0) {
            dados.save(receita);
        }
    }

    @DeleteMapping
    public void deletar(@RequestBody Receitas receita) {
        dados.delete(receita);
    }

}
