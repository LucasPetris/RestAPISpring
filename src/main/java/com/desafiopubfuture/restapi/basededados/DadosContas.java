package com.desafiopubfuture.restapi.basededados;

import com.desafiopubfuture.restapi.entidades.Contas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DadosContas extends JpaRepository<Contas,Long>{

            // --- QUERIES PARA A ENTIDADE CONTAS --- //

    // Query Nativa para selecionar e somar o saldo de todas contas da entidade Contas //
    @Query("SELECT SUM(m.saldo) FROM Contas m")
    Float findBySaldoTotal();
}
