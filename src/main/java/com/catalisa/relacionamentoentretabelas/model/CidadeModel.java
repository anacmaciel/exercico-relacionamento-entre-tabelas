package com.catalisa.relacionamentoentretabelas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cidades")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Regiao;
    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "id")
    private EstadoModel estado;
}
