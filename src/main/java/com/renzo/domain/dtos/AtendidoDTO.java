package com.renzo.domain.dtos;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.renzo.domain.Atendido;

public class AtendidoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataMatricula;

	public AtendidoDTO() {

	}

	public AtendidoDTO(Atendido obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.dataNascimento = obj.getDataNascimento();
		this.dataMatricula = obj.getDataMatricula();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

}
