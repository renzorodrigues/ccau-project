package com.renzo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.renzo.domain.Atendido;

@Repository
public interface AtendidoRepository extends PagingAndSortingRepository<Atendido, Long>, JpaRepository<Atendido, Long> {

}
