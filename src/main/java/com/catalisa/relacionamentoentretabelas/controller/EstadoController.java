package com.catalisa.relacionamentoentretabelas.controller;

import com.catalisa.relacionamentoentretabelas.model.EstadoModel;
import com.catalisa.relacionamentoentretabelas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<EstadoModel> cadastrarEstado(@RequestBody EstadoModel estadoModel) {
        EstadoModel estado = estadoService.cadastrar(estadoModel);
        return new ResponseEntity<>(estado, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<EstadoModel> alterarEstado(EstadoModel estadoModel) {
        return ResponseEntity.ok(estadoService.alterar(estadoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarEstado(@PathVariable Integer id) {
        estadoService.deletar(id);
    }
}
