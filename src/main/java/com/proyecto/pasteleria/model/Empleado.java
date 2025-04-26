package com.proyecto.pasteleria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private Long id;
    private String nombre;
    private String rol;
    private String especialidad;

}
