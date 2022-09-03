package com.catalisa.relacionamentoentretabelas.repository;

import com.catalisa.relacionamentoentretabelas.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel, Integer> {
}
