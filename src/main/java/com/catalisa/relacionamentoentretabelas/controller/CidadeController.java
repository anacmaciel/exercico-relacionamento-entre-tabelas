package com.catalisa.relacionamentoentretabelas.controller;

import com.catalisa.relacionamentoentretabelas.model.CidadeModel;
import com.catalisa.relacionamentoentretabelas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<CidadeModel> buscarTodasAsCidades() {
        return cidadeService.buscartodas();
    }

    @GetMapping(path = "/{id}")
    public Optional<CidadeModel> buscarTodasAsCidadesPorId(@PathVariable Integer id) {
        return cidadeService.buscarPorId(id);
    }
}
