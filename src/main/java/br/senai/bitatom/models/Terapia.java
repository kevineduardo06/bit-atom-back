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
@Table(name="terapia")
public class Terapia implements Serializable{
	

	private static final long serialVersionUID = 7487513456913841291L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
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
