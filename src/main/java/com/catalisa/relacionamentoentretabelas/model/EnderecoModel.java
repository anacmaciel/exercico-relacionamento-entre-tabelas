package com.catalisa.relacionamentoentretabelas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "enderecos")
public class EnderecoModel implements Serializable {

}
