package com.renzo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.renzo.domain.Atendido;
import com.renzo.repositories.AtendidoRepository;

@Service
public class AtendidoService {

	@Autowired
	private AtendidoRepository repo;
	
	public List<Atendido> findAll(){
		List<Atendido> atendidos = repo.findAll();
		return atendidos;
	}
	
	public Page<Atendido> findAllPageable(Pageable pageable){
		Page<Atendido> atendidos = repo.findAll(pageable);
		return atendidos;
	}
	
}
