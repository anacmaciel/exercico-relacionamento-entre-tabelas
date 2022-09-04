package com.catalisa.relacionamentoentretabelas.controller;

import com.catalisa.relacionamentoentretabelas.model.BairroModel;
import com.catalisa.relacionamentoentretabelas.service.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/bairros")
public class BairroController {

    @Autowired
    private BairroService bairroService;
    @GetMapping
    public ResponseEntity<Iterable<BairroModel>> buscarTodosOsBairros() {
        return ResponseEntity.ok(bairroService.buscarTodos());
    }
    @GetMapping(path = "/{id}")
   public ResponseEntity<Optional<BairroModel>> buscarBairroPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(bairroService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<BairroModel> cadastrarBairro(@RequestBody BairroModel bairroModel) {
        BairroModel bairro = bairroService.cadastrar(bairroModel);
        return new ResponseEntity<>(bairro, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<BairroModel> alterarBairro(@RequestBody BairroModel bairroModel) {
        return ResponseEntity.ok(bairroService.alterar(bairroModel));
    }
    @DeleteMapping(path = "/{id}")
    public void deletarBairro(@PathVariable Integer id) {
        bairroService.deletar(id);
    }
}
