package br.senai.bitatom.models;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "terapia")
public class Terapia implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "inicio_terapia")
    private LocalDate inicioTerapia;

    @Column(name = "fim_terapia")
    private LocalDate fimTerapia;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medicamento_um", referencedColumnName = "id")
    private Medicamento medicamentoUm;

    @Column(name = "dose_um")
    private int doseUm;

    @Column(name = "intervalo_um")
    private Time intevaloUm;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medicamento_dois", referencedColumnName = "id")
    private Medicamento medicamentoDois;

    @Column(name = "dose_dois")
    private int doseDois;

    @Column(name = "intervalo_dois")
    private Time intevaloDois;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medicamento_tres", referencedColumnName = "id")
    private Medicamento medicamentoTres;

    @Column(name = "dose_tres")
    private int doseTres;

    @Column(name = "intervalo_tres")
    private Time intevaloTres;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;



}
