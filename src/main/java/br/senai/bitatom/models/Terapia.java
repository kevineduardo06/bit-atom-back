package br.senai.bitatom.models;

import java.time.LocalDate;

import lombok.Data;

@Data 
public class Terapia {
	
	public LocalDate inicioTerapia;
	public LocalDate fimTerapia;
	public Long idMedicamentos;
	public Long idPaciente;
	

}
