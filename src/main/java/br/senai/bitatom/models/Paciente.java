package br.senai.bitatom.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="paciente")
public class Paciente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
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
