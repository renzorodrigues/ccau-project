package com.renzo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renzo.domain.Atendido;
import com.renzo.domain.dtos.AtendidoDTO;
import com.renzo.services.AtendidoService;

@RestController
@RequestMapping("/atendidos")
public class AtendidoResource {

	@Autowired
	private AtendidoService service;

	@GetMapping
	public ResponseEntity<List<AtendidoDTO>> buscaTodos() {
		List<Atendido> list = service.findAll();
		List<AtendidoDTO> listDto = list.stream().map(obj -> new AtendidoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping("/page")
	public ResponseEntity<Page<AtendidoDTO>> buscaTodosPaginados(Pageable pageable) {
		Page<Atendido> pageList = service.findAllPageable(pageable);
		Page<AtendidoDTO> pageListDto = new PageImpl<AtendidoDTO>(pageList.stream().map(obj -> new AtendidoDTO(obj)).collect(Collectors.toList()), pageable, pageList.getTotalElements());
		return ResponseEntity.ok().body(pageListDto);
	}

}
