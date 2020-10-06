package br.senai.bitatom.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data 
public class Medicamento {

	public Long id;
	public String nome;
	public LocalDate inicioMed;
	public LocalDate fimMed;
	public LocalDateTime intervaloTempo;
	public int dose;
	
	
}
