package com.example.demo.controller;

import com.example.demo.entity.Produit;
import com.example.demo.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {

    @Autowired
    private ICrudService<Produit,Long> produitService;

    @GetMapping
    public List<Produit> getAll(){
        return produitService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Produit produit){
        produitService.add(produit);
    }

    @PutMapping
    public void update(@RequestBody Produit produit){
        produitService.update(produit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produitService.delete(id);
    }
}
