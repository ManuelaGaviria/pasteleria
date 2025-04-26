package com.proyecto.pasteleria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    private Long id;
    private String nombre;
    private Integer stockActual;
    private Integer stockMinimo;

}
