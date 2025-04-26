package com.proyecto.pasteleria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private Long id;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private String direccion;
}
