package com.prueba.api.service.impl;

import com.prueba.api.dao.entity.TipCambioEntity;
import com.prueba.api.dao.repository.TipCambioRepository;
import com.prueba.api.service.TipCambioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipCambioImpl implements TipCambioService{

    @Autowired
    public TipCambioRepository  tipCambioRepository;
    
    @Override
    public TipCambioEntity insertar(TipCambioEntity tipCambio) {
        return tipCambioRepository.save(tipCambio);
    }

    @Override
    public TipCambioEntity devolver() {
        return tipCambioRepository.findById(1);
    }
    
}
