package br.senai.bitatom.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
@Entity
@Table(name="receita")
public class Receita {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_medicamento", referencedColumnName = "id")
    private Medicamento medicamento;

    @Column(name = "dose")
    private int dose;

    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "intervalo")
    private LocalTime intervalo;


   @OneToOne
   private Terapia terapia;

    public Receita(){}

    public Receita(Medicamento medicamento, int dose, LocalTime intervalo) {
        super();
        this.medicamento = medicamento;
        this.dose = dose;
        this.intervalo = intervalo;
    }
}
