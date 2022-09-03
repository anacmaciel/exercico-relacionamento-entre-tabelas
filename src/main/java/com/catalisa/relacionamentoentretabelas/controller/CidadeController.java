package com.catalisa.relacionamentoentretabelas.controller;

import com.catalisa.relacionamentoentretabelas.model.CidadeModel;
import com.catalisa.relacionamentoentretabelas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<CidadeModel> buscarTodasCidades() {
        return cidadeService.buscartodas();
    }

    
}
