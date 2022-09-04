package com.catalisa.relacionamentoentretabelas.controller;

import com.catalisa.relacionamentoentretabelas.model.EstadoModel;
import com.catalisa.relacionamentoentretabelas.service.CidadeService;
import com.catalisa.relacionamentoentretabelas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public ResponseEntity<Iterable<EstadoModel>> buscarTodosOsEstados() {
        return ResponseEntity.ok(estadoService.buscarTodos());
    }
@GetMapping(path = "/{id}")
    public ResponseEntity<Optional<EstadoModel>> buscarEstadoPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(estadoService.buscarPorId(id));
    }

    
}
