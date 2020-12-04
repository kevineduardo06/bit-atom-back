package br.senai.bitatom.models;

import java.io.Serializable;
import java.sql.Time;
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
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id;
	@Column(name="inicio_terapia")
	private LocalDate inicioTerapia;
	@Column(name="fim_terapia")
	private LocalDate fimTerapia;
	@Column(name="id_medicamento_um")
	private Long idMedicamentoUm;
	@Column(name="dose_um")
	private int doseUm;
	@Column(name="intervalo_um")
	private Time intevaloUm;
	@Column(name="intervalo_dois")
	private Time intevaloDois;
	@Column(name="intervalo_tres")
	private Time intevaloTres;
	@Column(name="id_medicamento_dois")
	private Long idMedicamentoDois;
	@Column(name="dose_dois")
	private int doseDois;
	@Column(name="id_medicamento_tres")
	private Long idMedicamentoTres;
	@Column(name="dose_tres")
	private int doseTres;
	@Column(name="id_paciente")
	private Long idPaciente;
	

}
