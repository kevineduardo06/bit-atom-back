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


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="sintoma_um")
	private String sintomaUm;
	@Column(name="sintoma_dois")
	private String sintomaDois;
	@Column(name="sintoma_tres")
	private String sintomaTres;


	
	
}
