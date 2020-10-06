package br.senai.bitatom.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data 
public class Medicamento {

	@Id
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="inicio_medicamento")
	private LocalDate inicioMedicamento;
	@Column(name="fim_medicamento")
	private LocalDate fimMedicamento;
	@Column(name="intervalo_tempo")
	private LocalDateTime intervaloTempo;
	@Column(name="dose")
	private int dose;
	
	
}
