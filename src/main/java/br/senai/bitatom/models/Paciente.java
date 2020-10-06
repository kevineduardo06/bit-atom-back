package br.senai.bitatom.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Paciente {
	
	public Long id;
	
	public String nomePaciente;
	public String email;
	public String senha;
	public char sexo;
	public LocalDate idade;
	
	public Long id_medico;
	
	
	

}
