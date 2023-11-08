package io.github.dougllasfps.domain.repositorio;

import io.github.dougllasfps.domain.entity.Cliente;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface Clientes extends JpaRepository<Cliente, Integer> {
 @Query(value = "select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> encontrarPorNome(@Param("nome") String nome);
 @Query(" delete from Cliente c where c.nome =:nome ")
 @Modifying
 void deleteByNome(String nome);
 boolean existsByNome(String nome);




}