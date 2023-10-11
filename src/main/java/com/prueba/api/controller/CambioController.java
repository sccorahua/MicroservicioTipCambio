package com.prueba.api.controller;

import com.prueba.api.dao.entity.CambioEntity;
import com.prueba.api.dao.entity.TipCambioEntity;
import com.prueba.api.service.CambioService;
import com.prueba.api.service.TipCambioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cambio")
public class CambioController {

    @Autowired
    private CambioService cambioService;

    @Autowired
    private TipCambioService tipCambioService;

    @PostMapping()
    public String insCambio(@RequestBody CambioEntity cambio) {
        TipCambioEntity tipCambio = tipCambioService.devolver();
        float monDev = (float) 0.00;
        String rpta = "";

        if (cambio.getMonedaOri().equals("soles")) {
            monDev = cambio.getMonto() * tipCambio.getValCambioCompra();
        } else if (cambio.getMonedaOri().equals("dolares")) {
            monDev = cambio.getMonto() * tipCambio.getValCambioVenta();
        }
        rpta = "Solicitud: " + cambio.getMonto() + cambio.getMonedaOri() + ", Devolucion: " + monDev + cambio.getMonedaDes();

        return rpta;
    }
}
