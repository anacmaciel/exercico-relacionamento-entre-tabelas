package com.catalisa.relacionamentoentretabelas.service;

import com.catalisa.relacionamentoentretabelas.model.BairroModel;
import com.catalisa.relacionamentoentretabelas.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    public BairroModel cadastrar(BairroModel bairroModel) {
        bairroModel.getId();
        bairroModel.getNomeBairro();
        bairroModel.getCidade();
        return bairroRepository.save(bairroModel);
    }

    public List<BairroModel> buscarTodos() {
        return bairroRepository.findAll();
    }

    public BairroModel alterar(BairroModel bairroModel) {
        bairroModel.getId();
        bairroModel.getNomeBairro();
        bairroModel.getCidade();

        return bairroRepository.save(bairroModel);
    }

    public Optional<BairroModel> buscarPorId(Integer id) {
        return bairroRepository.findById(id);
    }

    public void deletar(Integer id) {
        bairroRepository.deleteById(id);
    }
}
