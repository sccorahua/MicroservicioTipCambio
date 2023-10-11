package com.prueba.api.dao.repository;

import com.prueba.api.dao.entity.TipCambioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipCambioRepository extends JpaRepository<TipCambioEntity, Integer>{
    public TipCambioEntity findById(int id);
}
