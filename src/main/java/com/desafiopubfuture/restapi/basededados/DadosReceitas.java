package com.desafiopubfuture.restapi.basededados;

import java.time.LocalDate;
import java.util.List;

import com.desafiopubfuture.restapi.entidades.Receitas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DadosReceitas extends JpaRepository<Receitas,Long>{

                // --- QUERIES PARA A ENTIDADE RECEITAS --- //

    // Query nativa com Select para retornar um tipo de Receita como parametro //
    @Query("SELECT ud from Receitas ud where ud.tipoReceita=?1")
    public List<Receitas> getReceitaByTipoReceita(String tipoReceita);

    // Query nativa com Select para retornar a listagem de uma Data inicial e uma Data final//
    @Query("SELECT ud from Receitas ud where ud.dataRecebimento between ?1 and ?2 ORDER BY ud.dataRecebimento ASC")
    public List<Receitas> findByDataRecebimento(LocalDate data1, LocalDate data2);



    
    
}
