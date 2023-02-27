package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
