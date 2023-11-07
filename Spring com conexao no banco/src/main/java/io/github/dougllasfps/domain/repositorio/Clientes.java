package io.github.dougllasfps.domain.repositorio;

import io.github.dougllasfps.domain.entity.Cliente;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Clientes extends JpaRepository<Cliente, Integer> {

    //List<Cliente> findByNomeLike(String nome);
   boolean existsByNome(String nome);




}