package com.catalisa.relacionamentoentretabelas.service;

import com.catalisa.relacionamentoentretabelas.model.CidadeModel;
import com.catalisa.relacionamentoentretabelas.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeModel> buscartodas() {
        return cidadeRepository.findAll();
    }

    public Optional<CidadeModel> buscarPorId(Integer id) {
        return cidadeRepository.findById(id);
    }

    public CidadeModel cadastrar(CidadeModel cidadeModel) {
        cidadeModel.getId();
        cidadeModel.getNomeCidade();
        cidadeModel.getEstado();
        return cidadeRepository.save(cidadeModel);
    }

    public CidadeModel alterar(CidadeModel cidadeModel) {
        cidadeModel.getId();
        cidadeModel.getNomeCidade();
        cidadeModel.getEstado();
        return cidadeRepository.save(cidadeModel);
    }

    public void deletar(Integer id) {
        cidadeRepository.deleteById(id);
    }
}
