package com.catalisa.relacionamentoentretabelas.repository;

import com.catalisa.relacionamentoentretabelas.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository  extends JpaRepository<CidadeModel, Integer> {
}
