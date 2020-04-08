package com.example.spring.latihan.controller;

import com.example.spring.latihan.entity.Produk;
import com.example.spring.latihan.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdukController {
    @Autowired
    private ProdukService service;
    @PostMapping("/addProduk")
    public Produk addProduk(@RequestBody Produk produk){
        return service.saveProduk(produk);
    }
    @PostMapping("/addListProduk")
    public List<Produk> addSemuaProduk(@RequestBody List<Produk> produkList){
        return service.saveProdukList(produkList);
    }
    @GetMapping("/produk")
    public List<Produk> findAllProducts(){
        return service.getProdukAll();
    }
    @GetMapping("/produk/{id}")
    public Produk findProdukById(@PathVariable int id){
        return service.getProduk(id);
    }
    @PutMapping("/update")
    public Produk updateProduk(@RequestBody Produk produk){
        return service.updateProduk(produk);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduk(@PathVariable int id){
        return service.deleteProduk(id);
    }


}
