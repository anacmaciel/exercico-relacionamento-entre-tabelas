package com.catalisa.relacionamentoentretabelas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "item_pedido")
public class ItemPedidoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;
    private BigDecimal precoUnitario;

    @ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private PedidoModel pedido;
    @ManyToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private ProdutoModel produto;

}