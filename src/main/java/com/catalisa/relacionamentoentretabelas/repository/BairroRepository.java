package com.catalisa.relacionamentoentretabelas.repository;

import com.catalisa.relacionamentoentretabelas.model.BairroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<BairroModel, Integer> {

}
