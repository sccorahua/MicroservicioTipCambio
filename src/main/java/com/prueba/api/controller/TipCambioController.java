package com.prueba.api.controller;

import com.prueba.api.dao.entity.TipCambioEntity;
import com.prueba.api.service.TipCambioService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tipo-de-cambio")
public class TipCambioController {

    Logger logger = LoggerFactory.getLogger(TipCambioController.class);

    @Autowired
    private TipCambioService tipCambioService;

    @GetMapping()
    public TipCambioEntity devolverTipCambio() {
        return tipCambioService.devolver();
    }

    @PostMapping()
    public TipCambioEntity modTipCambio(@RequestBody TipCambioEntity tipCambio) {
        logger.debug("Se modifico el tipo de cambio");
        tipCambio.setId(1);
        return tipCambioService.insertar(tipCambio);
    }
}
