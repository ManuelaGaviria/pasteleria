package com.proyecto.pasteleria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Long id;
    private String nombre;
    private String descripcion;
    private Double precioBase;
    private Boolean disponibilidad;

}
