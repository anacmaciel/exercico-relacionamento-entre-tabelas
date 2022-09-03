package com.catalisa.relacionamentoentretabelas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "estados")
public class EstadoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome_estado")
    private String nomeEstado;
    @JsonIgnore
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<EnderecoModel> enderecoModels;
}
