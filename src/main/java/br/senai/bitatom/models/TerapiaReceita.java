package br.senai.bitatom.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="terapia_receita")
public class TerapiaReceita implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="terapia_id", referencedColumnName = "id")
    private Terapia terapia;

    @EmbeddedId
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="receita_id", referencedColumnName = "id")
    private Receita receita;
}
