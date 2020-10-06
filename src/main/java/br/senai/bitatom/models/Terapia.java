package br.senai.bitatom.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data 
public class Terapia {
	
	@Id
	private Long Id;
	@Column(name="inicio_terapia")
	private LocalDate inicioTerapia;
	@Column(name="fim_terapia")
	private LocalDate fimTerapia;
	@Column(name="id_medicamentos")
	private Long idMedicamentos;
	@Column(name="id_paciente")
	private Long idPaciente;
	

}
