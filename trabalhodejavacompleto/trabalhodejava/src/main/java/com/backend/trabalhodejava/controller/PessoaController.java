package com.backend.trabalhodejava.controller;

import com.backend.trabalhodejava.dto.PessoaDto;
import com.backend.trabalhodejava.model.Pessoa;
import com.backend.trabalhodejava.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> createPessoa(@RequestBody PessoaDto pessoaDto) {
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaDto, pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaRepository.save(pessoa));
    }

    @GetMapping("/pessoa/{id}")
    public ResponseEntity<Object> getPessoaById(@PathVariable UUID id) {
        Optional<Pessoa> foundPessoa = pessoaRepository.findById(id);
        if (foundPessoa.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(foundPessoa.get());
    }

}
