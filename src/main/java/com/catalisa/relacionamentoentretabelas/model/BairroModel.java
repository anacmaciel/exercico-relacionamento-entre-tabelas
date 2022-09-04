package com.catalisa.relacionamentoentretabelas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bairros")
public class BairroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String NomeBairro;
    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private CidadeModel cidade;
}
