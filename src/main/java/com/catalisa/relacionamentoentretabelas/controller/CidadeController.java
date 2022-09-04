package com.catalisa.relacionamentoentretabelas.controller;

import com.catalisa.relacionamentoentretabelas.model.CidadeModel;
import com.catalisa.relacionamentoentretabelas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public ResponseEntity<List<CidadeModel>> buscarTodasAsCidades() {
        return ResponseEntity.ok(cidadeService.buscartodas());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<CidadeModel>> buscarTodasAsCidadesPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(cidadeService.buscarPorId(id);
    }

@PostMapping
    public ResponseEntity<CidadeModel> cadastrarCidade(@RequestBody CidadeModel cidadeModel) {
        CidadeModel cidade = cidadeService.cadastrar();
        return new ResponseEntity<>(cidade, HttpStatus.CREATED);
    }

@PutMapping(path = "/{id}")
    public ResponseEntity<CidadeModel> alterarCidade(CidadeModel cidadeModel) {
        return ResponseEntity.ok(cidadeService.alterar());
    }

    
}
