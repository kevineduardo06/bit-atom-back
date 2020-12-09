package br.senai.bitatom.models;

import java.io.Serializable;
import java.util.Date;

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
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nome_paciente")
	private String nomePaciente;
	@Column(name="email")
	private String email;
	@Column(name="senha")
	private String senha;
	@Column(name="sexo")
	private Character sexo;
	@Column(name="data_nascimento")
	private Date dataNascimento;





	
	
	

}
