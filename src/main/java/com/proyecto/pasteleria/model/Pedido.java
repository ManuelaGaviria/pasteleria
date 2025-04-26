package com.proyecto.pasteleria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private Long id;
    private Long clienteId;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaEntregaEstimada;
    private Long estadoActualId;
    private Double totalPagar;

}
