package com.backend.trabalhodejava.repository;

import com.backend.trabalhodejava.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, UUID> {
}
