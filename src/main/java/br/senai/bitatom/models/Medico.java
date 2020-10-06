package br.senai.bitatom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name="medico")
public class Medico {
	
	@Id
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="id_paciente")
	private String idPaciente;

}
