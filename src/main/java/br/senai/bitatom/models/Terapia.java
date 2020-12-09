package br.senai.bitatom.models;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

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

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medicamentoUm", referencedColumnName = "id")
   private Medicamento medicamentoUm;

    @Column(name = "dose_um")
    private int doseUm;

    @Column(name = "intervalo_um")
    private LocalTime intervaloUm;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medicamentoDois", referencedColumnName = "id")
    private Medicamento medicamentoDois;

    @Column(name = "dose_dois")
    private int doseDois;

    @Column(name = "intervalo_dois")
    private LocalTime intervaloDois;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medicamentoTres", referencedColumnName = "id")
    private Medicamento medicamentoTres;

    @Column(name = "dose_tres")
    private int doseTres;

    @Column(name = "intervalo_tres")
    private LocalTime intervaloTres;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;



}
