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
@Table(name = "cidades")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCidade;
    @JsonIgnore
    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<BairroModel> bairros;
    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "id")
    private EstadoModel estado;
}
