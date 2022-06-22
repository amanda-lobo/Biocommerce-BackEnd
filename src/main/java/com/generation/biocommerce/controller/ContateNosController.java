package com.generation.biocommerce.controller;

import com.generation.biocommerce.model.ContateNos;
import com.generation.biocommerce.repository.ContateNosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/contate-nos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContateNosController {

    @Autowired
    private ContateNosRepository contateNosRepository;

    @GetMapping
    public ResponseEntity<List<ContateNos>> getAll(){
        return ResponseEntity.ok(contateNosRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContateNos> getById(@PathVariable Long id){
        return contateNosRepository.findById(id)
                .map(resposta -> ResponseEntity.ok(resposta))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ContateNos> postContato(@Valid @RequestBody ContateNos contato){
        return ResponseEntity.status(HttpStatus.CREATED).body(contateNosRepository.save(contato));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduto(@PathVariable Long id) {
        return contateNosRepository.findById(id)
                .map(resposta -> {
                    contateNosRepository.deleteById(id);
                    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}