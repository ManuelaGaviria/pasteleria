package com.proyecto.pasteleria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoProducto {

    private Long id;
    private Long pedidoId;
    private Long productoId;
    private Integer cantidad;
    private String personalizacion;
    private Double precioFinal;

}
