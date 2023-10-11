package com.prueba.api;

import com.prueba.api.dao.entity.CambioEntity;
import com.prueba.api.dao.entity.TipCambioEntity;
import com.prueba.api.service.TipCambioService;
import com.prueba.api.service.impl.TipCambioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    @Autowired
    private TipCambioService tipCambioService;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TipCambioEntity tipCambio = new TipCambioEntity();
        TipCambioService tipCambioServ = null;
        tipCambio.setValCambioCompra((float) 3.15);
        tipCambio.setValCambioVenta((float) 3.50);
        tipCambioService.insertar(tipCambio);
    }
}
