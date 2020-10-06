package br.senai.bitatom.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;


@Data
public class Paciente {
	
	@Id
	private Long id;
	
	@Column(name= "nome_paciente")
	private String nomePaciente;
	@Column(name="email")
	private String email;
	@Column(name="senha")
	private String senha;
	@Column(name="sexo")
	private char sexo;
	@Column(name="idade")
	private LocalDate idade;
	@Column(name="id_medico")
	private Long idMedico;
	
	
	

}
