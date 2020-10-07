package br.senai.bitatom.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="medicamento")
public class Medicamento implements Serializable{


	private static final long serialVersionUID = 3430486560553342369L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
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
