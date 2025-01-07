package com.projetojava.aprendendospringboot.infrastructure.entity.repository;

import com.projetojava.aprendendospringboot.infrastructure.entity.Endereco;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
