package br.senai.bitatom.models;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "terapia")
public class Terapia implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name= "nome")
    private String nome;

    @Column(name = "inicio_terapia")
    private Date inicioTerapia;

    @Column(name = "fim_terapia")
    private Date fimTerapia;

    @OneToMany(cascade = CascadeType.PERSIST, targetEntity= Receita.class)
    private List<Receita> receita;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;

    public Terapia(){}

    public Terapia(String nome, Date inicioTerapia, Date fimTerapia, List<Receita> receita, Paciente paciente, Medico medico) {
        this.nome = nome;
        this.inicioTerapia = inicioTerapia;
        this.fimTerapia = fimTerapia;
        this.receita = receita;
        this.paciente = paciente;
        this.medico = medico;
    }
}
