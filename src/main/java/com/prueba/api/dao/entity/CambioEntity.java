package com.prueba.api.dao.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
public class CambioEntity {

    private float monto;
    private String monedaOri;
    private String monedaDes;
}
