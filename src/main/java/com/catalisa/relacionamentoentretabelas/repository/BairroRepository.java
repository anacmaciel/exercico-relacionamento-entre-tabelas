package com.catalisa.relacionamentoentretabelas.repository;

import com.catalisa.relacionamentoentretabelas.model.BairroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface BairroRepository extends JpaRepository<BairroModel, Integer> {

}
