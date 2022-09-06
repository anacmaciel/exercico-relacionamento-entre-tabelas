package com.catalisa.relacionamentoentretabelas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;

@Entity
@Data
@NoArgsConstructor
@Table("produtos")
public class ProdutoModel  implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String nomeProduto;
private String descricao;
private BigDecimal preco;
private LocalDate dataCadastro = LocalDate.now(ZoneId.of("UTC-03:00"));
@ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private
}
