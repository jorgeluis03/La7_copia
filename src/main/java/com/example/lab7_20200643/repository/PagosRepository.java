package com.example.lab7_20200643.repository;

import com.example.lab7_20200643.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagosRepository extends JpaRepository<Pagos,Integer> {
}
