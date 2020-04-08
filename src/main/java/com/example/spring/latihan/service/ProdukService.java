package com.example.spring.latihan.service;

import com.example.spring.latihan.entity.Produk;
import com.example.spring.latihan.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdukService {
    @Autowired
    private ProdukRepository repository;
    public Produk saveProduk(Produk produk){
            return repository.save(produk);
    }
    public List<Produk> saveProdukList(List<Produk> produkList){
        return repository.saveAll(produkList);
    }
    public List<Produk> getProdukAll(){
;        return repository.findAll();
    }
    public Produk getProduk(int id){
        return repository.findById(id).orElse(null);
    }
//    public Produk getProdukByName(String name){
//        return repository.findByName(name);
//    }
    public String deleteProduk(int id){
        repository.deleteById(id);
        return "Product Removed"+id;
    }
    public Produk updateProduk(Produk produk){
        Produk existingProduk=repository.findById(produk.getId()).orElse(null);
        existingProduk.setName(produk.getName());
        existingProduk.setQty(produk.getQty());
        existingProduk.setPrice(produk.getPrice());
        return repository.save(existingProduk);
    }
}
