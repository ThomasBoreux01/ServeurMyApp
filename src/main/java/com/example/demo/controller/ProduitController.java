package com.example.demo.controller;

import com.example.demo.service.IProduitService;
import entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {

    @Autowired
    private IProduitService produitService;

    @GetMapping
    public List<Produit> getProduits(){
        return produitService.getProduits();
    }

    @PostMapping
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }

    @PutMapping
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
    }

    @DeleteMapping("/{ref}")
    public void deleteProduit(@PathVariable String ref){
        produitService.deleteProduit(ref);
    }
}
