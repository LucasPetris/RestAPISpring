package com.desafiopubfuture.restapi.basededados;

import java.time.LocalDate;
import java.util.List;

import com.desafiopubfuture.restapi.entidades.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DadosDespesas extends JpaRepository<Despesas,Long> {

            // --- QUERIES PARA A ENTIDADE DESPESAS --- //

    // Query nativa com Select para retornar um tipo de Despesa como parametro //
    @Query("SELECT ud from Despesas ud where ud.tipoDespesa=?1")
    public List<Despesas> getDespesaByTipoDespesa(String tipoDespesa);

    // Query nativa com Select para retornar a listagem de uma Data inicial e uma Data final//
    @Query("SELECT ud from Despesas ud where ud.dataPagamento between ?1 and ?2 ORDER BY ud.dataPagamento ASC")
    public List<Despesas> findByDataPagamento(LocalDate data1, LocalDate data2);
}
