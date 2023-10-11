package com.prueba.api.service;

import com.prueba.api.dao.entity.TipCambioEntity;
import java.util.List;

public interface TipCambioService {

    public TipCambioEntity insertar(TipCambioEntity tipCambio);

    public TipCambioEntity devolver();
}
