package com.catalisa.relacionamentoentretabelas.service;

import com.catalisa.relacionamentoentretabelas.model.EstadoModel;
import com.catalisa.relacionamentoentretabelas.repository.BairroRepository;
import com.catalisa.relacionamentoentretabelas.repository.CidadeRepository;
import com.catalisa.relacionamentoentretabelas.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    public List<EstadoModel> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Optional<EstadoModel> buscarPorId(Integer id) {
        return estadoRepository.findById(id);
    }

    public EstadoModel cadastrar(EstadoModel estadoModel) {
        estadoModel.getId();
        estadoModel.getNomeEstado();
        return estadoRepository.save(estadoModel);
    }

    public EstadoModel alterar(EstadoModel estadoModel) {
        estadoModel.getId();
        estadoModel.getNomeEstado();
        return estadoRepository.save(estadoModel);
    }

    public void deletar(Integer id) {
        estadoRepository.deleteById(id);
    }
}
