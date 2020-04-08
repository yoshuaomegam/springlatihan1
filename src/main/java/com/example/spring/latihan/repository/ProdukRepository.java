package com.example.spring.latihan.repository;


import com.example.spring.latihan.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdukRepository extends JpaRepository<Produk, Integer> {

    Produk findByName(String name);
}
